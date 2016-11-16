import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Choose_j here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Choose_j extends Button
{
    Number number = new Number(0);
    Number number_j = new Number(1);
    boolean check_j = false;
    /**
     * Act - do whatever the Choose_j wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
       number_j = getN_clicked(); 
       
       // List<Message> msgs = world.getObjects(Message.class);
       // Message msg = msgs.get(0);  
    }    
    
    public Number getN_clicked(){
        QuickSortWorld world=(QuickSortWorld)getWorld();
        List<Number> num = world.getObjects(Number.class);
        for(Number n:num){
            if(Greenfoot.mouseClicked(n)){
                number = n;
            }
        }
        
        //check value for i
        List<Marker_j> mj = world.getObjects(Marker_j.class);

        if(Greenfoot.mouseClicked(this)){ 
            number_j = number;
            check_j = true;
            mj.get(0).move(number_j);
            //msg.setContent(number.value + " is chosen for i.");
        }
        return number_j;
    }
    
}
