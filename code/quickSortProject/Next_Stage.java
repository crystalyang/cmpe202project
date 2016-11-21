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
    private boolean stage_control=true;
    private boolean before_next=false;
    public void act() 
    {
        
        
        QuickSortWorld world=(QuickSortWorld)getWorld();
        if(!(world==null) && !world.getObjects(QuickSort.class).isEmpty()){
            if(mouseOnObject(this)) {
            this.setImage("nextstage_p.png");
            this.getImage().scale(100,120);
        
        }
        else{
           this.setImage("nextstage.png");
            this.getImage().scale(100,120);
        }
            stage_change();
        }
    }   
    
    public boolean get_before_next(){
        return before_next;
    }
    
    public boolean get_stage_control(){
        return stage_control;
    }
    
    
    public void stage_change(){
        QuickSortWorld world=(QuickSortWorld)getWorld();
        Controller c = world.getObjects(Controller.class).get(0);
        List<Number> number = world.getObjects(Number.class);
        Pivot pivot = world.getObjects(Pivot.class).get(0);
        List<Message> msgs = world.getObjects(Message.class);
        Swap s = world.getObjects(Swap.class).get(0);
        Message msg = msgs.get(0);
        Marker_j mj= world.getObjects(Marker_j.class).get(0);
       //check whether allows user go to the next stage
        if(pass()){
            //ignores the first pivot
            if(Greenfoot.mouseClicked(this)){
                int piv = c.pivots.get(this.stage+1);
                int node = c.nodes.get(this.stage+1);
                for(Number n:number){
                    if(n.getValue()==piv){
                        pivot.move(n);
                    }
                    if(n.getValue()==node){
                        mj.move(n);
                    }
                }
                this.stage = this.stage+1;
                stage_control=true;
                msg.setContent("Go on with another i and j. \n Choose between J and pivot now.");
            }
            else{
            //message to alert user to click next stage
                if(s.get_swap_check()==c.result.size()){
                    msg.setContent("Congratulations! Quick Sort is completed!");
                }
                else{
                    stage_control=false;
                    msg.setContent("You are ready for the next stage! \n\n  Click the Next Stage Button");
                }
                
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
    
        if(c.getStage()>0 && s.get_swap_check()==c.stage_alert.get(this.stage)){
            before_next=false;
            return true;
        }
        else{
            //int[] arr = c.result.get(0);
            //if(arr[1]==c.pivots.get(0) || (s.swap_check>0 && s.swap_check==c.stage_alert.get(this.stage)-1)){
            if(s.get_swap_check()>0 && s.get_swap_check()==(c.stage_alert.get(this.stage))-1){
                before_next=true;
            }
            return false;
        }
    }

        // Add your action code here.
}   
    
    
   

