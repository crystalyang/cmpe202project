import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
    
    public String content;
    

    public Message(String m){
        img_m = this.getImage();

         
        //img_m = this.getImage();
       // this.img_m=new GreenfootImage("msg.png");
        //img_m.scale(getImage().getWidth()-35,getImage().getHeight()-100);
        //img_m.set
        img_m.setFont(new java.awt.Font("Helvetica", java.awt.Font.PLAIN, 18));
        img_m.drawString(m,30,100);
        
        setImage(img_m);
        //img_m.setColor(Color.BLACK);
        //img_m.drawString(m,500,50);
        //getImage().scale(getImage().getWidth()-35,getImage().getHeight()-100);
        //img_m.drawImage(txtImg,(img_m.getWidth()-txtImg.getWidth())/2,(img_m.getHeight()-txtImg.getHeight())/2);
        
        content = m;
    }
    
    public void setContent(String m){
        img_m = this.getImage();
        img_m.clear();
        this.setImage("msg.png");
        this.getImage().setFont(new java.awt.Font("Helvetica", java.awt.Font.PLAIN, 18));
        this.getImage().drawString(m,30,100);
        content = m;
        //other color/font
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
