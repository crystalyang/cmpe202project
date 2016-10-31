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
    public Message(){
        img_m = this.getImage();
        img_m.scale(img_m.getWidth()-35,img_m.getHeight()-100);
    }
    
    public void setContent(String m){
        img_m.drawString(m,0,10);
        //other color/font
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
