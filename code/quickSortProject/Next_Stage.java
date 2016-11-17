import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Next_Stage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Next_Stage extends Button
{
    /**
     * Act - do whatever the Next_Stage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int stage;
    public boolean stage_control=true;
    public void act() 
    {

        QuickSortWorld world=(QuickSortWorld)getWorld();
        if(!(world==null) && !world.getObjects(QuickSort.class).isEmpty()){
            stage_change();
        }
    }   
    
    public void stage_change(){
        QuickSortWorld world=(QuickSortWorld)getWorld();
        Controller c = world.getObjects(Controller.class).get(0);
        List<Number> number = world.getObjects(Number.class);
        Pivot pivot = world.getObjects(Pivot.class).get(0);
        List<Message> msgs = world.getObjects(Message.class);
        Message msg = msgs.get(0);
       //check whether allows user go to the next stage
        if(pass()){
            //ignores the first pivot
            if(Greenfoot.mouseClicked(this)){
                int piv = c.pivots.get(this.stage+1);
                for(Number n:number){
                    if(n.value==piv){
                        pivot.move(n);
                    }
                }
                this.stage = this.stage+1;
                stage_control=true;
            }
            else{
            //message to alert user to click next stage
                stage_control=false;
                msg.setContent("You are ready for the next stage!");
            }
        }
        else{
            if(Greenfoot.mouseClicked(this)){
                //error message
                msg.setContent("You are not ready for the next stage!");
            }
        }
    
    }
    
    public boolean pass(){
        QuickSortWorld world=(QuickSortWorld)getWorld();
        Swap s = world.getObjects(Swap.class).get(0);
        Controller c = world.getObjects(Controller.class).get(0);
        if(c.stage>0 && s.swap_check==c.stage_alert.get(this.stage)){
            return true;
        }
        else{
            return false;
        }
    }

        // Add your action code here.
}   
    
    
   

