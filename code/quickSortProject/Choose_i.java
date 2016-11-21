import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Choose_i here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Choose_i extends Button
{
    int clicked_value=0;
    Number number = new Number(0);
    Number number_i = new Number(1);
    boolean check_i = false;
    /**
     * Act - do whatever the Choose_i wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void initial(Button c_i){
        
        //ButtonLeaf c_i = new Choose_i(); 
        c_i.setImage("choosei.png");
        c_i.getImage().scale(100,120);
    }
    public void act() 
    {
       
       QuickSortWorld world=(QuickSortWorld)getWorld();
       if(!(world==null) && !world.getObjects(QuickSort.class).isEmpty()){
           if(mouseOnObject(this)) {
            this.setImage("choosei_p.png");
            this.getImage().scale(100,120);
        
        }
        else{
           this.setImage("choosei.png");
            this.getImage().scale(100,120);
        }
           number_i = getN_clicked(); 
       }
    }    
    
    public Number getN_clicked(){
        QuickSortWorld world=(QuickSortWorld)getWorld();
        List<Number> num = world.getObjects(Number.class);
        List<Message> msgs = world.getObjects(Message.class);
        Message msg = msgs.get(0);
        for(Number n:num){
            if(Greenfoot.mouseClicked(n)){
                clicked_value = n.value;
                number = n; 
            }
        }
        List<Marker_i> mi = world.getObjects(Marker_i.class);
        
        if(Greenfoot.mouseClicked(this)){
            number_i = number;        
            check_i = true;
            mi.get(0).move(number_i);
            
            //message to let user know which j is chosen
            msg.setContent(number.value + " is chosen for i.");
        }
        return number_i;
    }
}
