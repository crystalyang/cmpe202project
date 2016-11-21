import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
import java.awt.GraphicsEnvironment;
/**
 * Message info class 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.Color;
public class Message extends Actor
{
    /**
     * Act - do whatever the Message wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage img_m=new GreenfootImage("msg.png");
  
    private String content;
    

    public Message(String m){
        img_m = this.getImage();
        img_m.setFont(new java.awt.Font("AppleGothic", java.awt.Font.PLAIN, 16));
        img_m.drawString(m,30,80);
        setImage(img_m);
        content = m;
    }
    
    public void setContent(String m){
        img_m = this.getImage();
        img_m.clear();
        this.setImage("msg.png");
        
        this.getImage().setFont(new Font("AppleGothic", Font.PLAIN, 16));
        this.getImage().drawString(m,30,80);
        content = m;
        //other color/font
    }
    
    public String getContent(){
        return content;
    }
    
    
    public void act() 
    {
        // Add your action code here.
    }    
}
