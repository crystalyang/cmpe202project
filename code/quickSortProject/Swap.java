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
    
    public int get_swap_check(){
        return swap_check;
    }
    
    public int get_error(){
        return error;
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
        List<Chance> cl = world.getObjects(Start.class).get(0).get_chance_list();
        if(msgs.size() !=0){
        Message msg = msgs.get(0);

        Number i = ci.get(0).get_number_i();
        Number j = cj.get(0).get_number_j();
        if(ci.get(0).get_check_i() && cj.get(0).get_check_j()){
            if(checkSwap(i,j) && ns.get_stage_control()){
                swapNumber(i,j);
                swap_check++;
                ns.stage_change();
                if(ns.get_before_next()){
                    msg.sayTimeMovePivot();
                    
                    
                }
                else{
                    
                    msg.saySwapSucceed();
                }
            }
            else if(!checkSwap(i,j)){
                error = error+1;
                if(error<5){
                    
                    msg.sayCannotSwapWithChance(5-error);
                    cl.get(error-1).getImage().setTransparency(0);
                }
                else{
                    cl.get(4).getImage().setTransparency(0);
                    msg.sayGameOver();

                }
            }
            else{
                
                msg.sayNextStage();
                
            }
        }
    }
    }
    
    public boolean checkSwap(Number i, Number j){
        boolean check_i = false;
        QuickSortWorld world=(QuickSortWorld)getWorld();
        List<int[]> result = world.getObjects(Controller.class).get(0).result;
        int[] arr=result.get(swap_check);
        if(arr[0]==i.getValue() && arr[1]==j.getValue()){
            check_i = true;
        }
        return check_i;
    }
}
