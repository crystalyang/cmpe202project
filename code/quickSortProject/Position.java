import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
    //ui array position
    //there will be a static position image, won't move
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
