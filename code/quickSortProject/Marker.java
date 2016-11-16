import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Marker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Marker extends Actor
{
    /**
     * Act - do whatever the Marker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }   
    
    //move the object to a number 
    public void move(Number i){
        int y = this.getY();
        int i_x = i.getX();
        this.setLocation(i_x, y);
    }
}
