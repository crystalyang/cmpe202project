import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Message info class 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Message extends Actor
{
    /**
     * Act - do whatever the Message wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage img_m;
    
    public String content;
    
    Message(String m){
        img_m = this.getImage();
        img_m.drawString(m,50,50);
        content = m;
    }
    
    public void setContent(String m){
        img_m = this.getImage();
        img_m.drawString(m,0,10);
        content = m;
        //other color/font
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
