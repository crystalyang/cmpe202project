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
    int test;
    public Controller(){
        test=2;
    }
    
    public void act() 
    {
        System.out.println("ffffff");
        // Add your action code here.
        Number n_pivot= new Number(0);
        QuickSortWorld world=(QuickSortWorld)getWorld();
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
    
    public boolean mouseOnObject(Actor obj)
    {
        MouseInfo mi = Greenfoot.getMouseInfo();
        int actorX = obj.getX(), actorY = obj.getY();
        int actorWide = obj.getImage().getWidth(), actorHigh = obj.getImage().getHeight();
        boolean check1 = mi.getX() >= actorX - actorWide / 2;
        boolean check2 = mi.getY() >= actorY - actorHigh / 2;
        boolean check3 = mi.getX() <= actorX + actorWide / 2;
        boolean check4 = mi.getY() <= actorY + actorHigh / 2;
        return check1 && check2 && check3 && check4;
    }
    
    public void swapNumber(Number i, Number j){
    
    }
    
    //check whether two numbers are allowed to be swaped with current pivot
    public boolean checkSwap(Number i, Number j){
        boolean check_i = false;
        return check_i;
    }
    
}
