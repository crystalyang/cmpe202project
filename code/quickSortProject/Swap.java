import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
    public void act() 
    {
        // Add your action code here.
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
}
