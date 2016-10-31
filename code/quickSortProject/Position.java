import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Position here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Position extends Actor
{
    /**
     * Act - do whatever the Position wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    // x,y indicates the position 
    int x, y;
    int index;
    //ui array position
    //there will be a static position image, won't move
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Position(int index) {
        this.index = index;
    }
    public String getFile(){
        return ("position" + ".png");
    }
    public void act() 
    {
        // Add your action code here.
    }  
    
    
   //when the number covered the pos, the pos disappear, and the Number take the place
   public void numberInsteadPos(){
    List<Number> numbers=getIntersectingObjects(Number.class);
    
    
    
   
    }
}
