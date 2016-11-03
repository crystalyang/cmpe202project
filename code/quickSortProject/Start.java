import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.*;
/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Button
{
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        clicked();
    }
    
    public void clicked(){
    
     if(Greenfoot.mouseClicked(this)) {
            List<QuickSort> qs=getObjectsInRange(500,QuickSort.class);
            qs.get(0).addedToWorldNextLine();
        }
    
    }
    
}
