import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Desktop;
import java.net.URI;

/**
 * Write a description of class Tutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tutorial extends Button
{
    /**
     * Act - do whatever the Tutorial wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
        
        String link = "https://youtu.be/LBiajXU_fAU";
        
        if(Desktop.isDesktopSupported()){
            try{
                Desktop.getDesktop().browse(new URI(link));
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        }
    }    
}
