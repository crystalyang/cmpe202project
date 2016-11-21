import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Swap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Swap extends Button
{
    /**
     * Act - do whatever the Swap wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int swap_check=0;
    public int error=0;
    public void initial(Button swap){
        //ButtonLeaf swap = new Swap();
        swap.setImage("swap.png");
        swap.getImage().scale(100,120);
    }
    public void act() 
    {
        QuickSortWorld world=(QuickSortWorld)getWorld();
        if(!(world==null) && !world.getObjects(QuickSort.class).isEmpty()){
            if(mouseOnObject(this)) {
                this.setImage("swap_p.png");
                this.getImage().scale(100,120);
        
            }
            else{
                this.setImage("swap.png");
                this.getImage().scale(100,120);
            }
        }
        
        if(Greenfoot.mouseClicked(this)){
            clicked();
        }
    }   
    
    public void swapNumber(Number i, Number j){
        int i_x, i_y, j_x, j_y;
        i_x = i.getX();
        i_y = i.getY();
        j_x = j.getX();
        j_y = j.getY();
        i.setLocation(j_x,j_y);
        j.setLocation(i_x,i_y);
    }
    
    public void clicked(){
        QuickSortWorld world=(QuickSortWorld)getWorld();
        List<Choose_i> ci = world.getObjects(Choose_i.class);
        List<Choose_j> cj = world.getObjects(Choose_j.class);
        Next_Stage ns = world.getObjects(Next_Stage.class).get(0);
        List<Message> msgs = world.getObjects(Message.class);
        List<Chance> cl = world.getObjects(Start.class).get(0).chance_list;
        Message msg = msgs.get(0);
        /*  //test code
        List<Number> num = world.getObjects(Number.class);
        for(Number n:num){
            if(n==ci.get(0).number_i){
                System.out.println(ci.get(0).number_i.value +"value for i get");
            }
            if(n==cj.get(0).number_j){
                System.out.println(cj.get(0).number_j.value +"value for j get");
            }
        } */
        Number i = ci.get(0).number_i;
        Number j = cj.get(0).number_j;
        if(ci.get(0).check_i && cj.get(0).check_j){
            if(checkSwap(i,j) && ns.stage_control){
                swapNumber(i,j);
                swap_check++;
                ns.stage_change();
                if(ns.before_next){
                    msg.setContent("Time to move the pivot. Swap the duck\n number with the number after i.");
                }
                else{
                    msg.setContent("  Great Job! \n  Go on with another i and j now.");
                }
            }
            else if(!checkSwap(i,j)){
                error = error+1;
                if(error<5){
                    msg.setContent("  You cannot swap those them!\n      Try different numbers.\n   You have another "+(5-error)+" chances.");
                    cl.get(error-1).getImage().setTransparency(0);
                }
                else{
                    cl.get(4).getImage().setTransparency(0);
                    msg.setContent("You tried five wrong swaps! \n Game End. Please reset and start again.");
                    Greenfoot.stop();
                }
            }
            else{
                msg.setContent("Please click the Next Stage button.");
            }
            
        }
    }
    
    public boolean checkSwap(Number i, Number j){
        boolean check_i = false;
        QuickSortWorld world=(QuickSortWorld)getWorld();
        List<int[]> result = world.getObjects(Controller.class).get(0).result;
        int[] arr=result.get(swap_check);
        if(arr[0]==i.value && arr[1]==j.value){
            check_i = true;
        }
        return check_i;
    }
}
