import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pivot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pivot extends Marker
{
    /**
     * Act - do whatever the Pivot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int p_value;
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void move(Number i){
        int y = this.getY();
        int i_x = i.getX();
        this.setLocation(i_x, y);
        p_value = i.value;
    }
}
