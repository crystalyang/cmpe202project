import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
import java.awt.GraphicsEnvironment;

/**
 * Write a description of class AdapteeObject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AdapteeObject extends Actor implements Adaptee
{
   GreenfootImage img_m=new GreenfootImage("msg.png");
   
   public AdapteeObject(){

   }
    
    public void printMessage(String s){
        img_m = this.getImage();
        img_m.clear();
        this.setImage("msg.png");
        this.getImage().scale(400,400);
       
        this.getImage().setFont(new Font("AppleGothic", Font.PLAIN, 16));
        this.getImage().drawString(s,0,20);

    }    
}
