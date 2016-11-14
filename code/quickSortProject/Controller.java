import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Controller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Controller extends Actor
{
    /**
     * Act - do whatever the Controller wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        Number n_pivot= new Number(0);
        World world=getWorld();
        List<Number> num = world.getObjects(Number.class);
        for(Number n:num){
            if(Greenfoot.mouseClicked(n)){
                n_pivot = n;
            }
        }// Add your action code here.
        int mark=0;
        for(Number n:num){
            if(n.value<n_pivot.value){
                mark+=1;
            }
        }
        n_pivot.setLocation(110*(mark+1), 260);
    }    
}
