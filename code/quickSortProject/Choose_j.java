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
    private Number number = new Number(0);
    private Number number_j = new Number(1);
    private boolean check_j = false;
    /**
     * Act - do whatever the Choose_j wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void initial(Button c_j){
        
        //ButtonLeaf c_j = new Choose_j(); 
        c_j.setImage("choosej.png");
        c_j.getImage().scale(100,120);
    }
    public void act() 
    {
       
        QuickSortWorld world=(QuickSortWorld)getWorld();
        if(!(world==null) && !world.getObjects(QuickSort.class).isEmpty()){
            if(mouseOnObject(this)) {
            this.setImage("choosej_p.png");
            this.getImage().scale(100,120);
        
        }
        else{
           this.setImage("choosej.png");
            this.getImage().scale(100,120);
        } 
            number_j = getN_clicked(); 
        }
         
    }    
    
    
    public  Number get_number_j(){
        return number_j;
    }
    
    public boolean get_check_j(){
        return check_j;
    }
    
    
    public Number getN_clicked(){
        QuickSortWorld world=(QuickSortWorld)getWorld();
        List<Number> num = world.getObjects(Number.class);
        List<Message> msgs = world.getObjects(Message.class);
        Message msg = msgs.get(0); 
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
            //message to let user know which j is chosen
            msg.setContent(number.getValue() + " is chosen for j.");
        }
        return number_j;
    }
    
}
