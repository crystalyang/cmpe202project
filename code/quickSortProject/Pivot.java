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
    private int p_value;
    
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void set_p_value(int _p_value){
        p_value=_p_value;
    }
    
    public int get_p_value( ){
        return p_value;
    }
    
    
    public void move(Number i){
        int y = this.getY();
        int i_x = i.getX();
        this.setLocation(i_x, y);
        p_value = i.getValue();
    }
}
