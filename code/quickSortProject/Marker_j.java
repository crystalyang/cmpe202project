import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Marker_j here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Marker_j extends Actor implements Marker
{
    /**
     * Act - do whatever the Marker_j wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public void move(Number i){
        Location l = new Location(i);
        this.setLocation(l.x, l.y);
    }
}
