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
    public void initial(Button t){

        t.setImage("tutorial.png");
        t.getImage().scale(100,120);
    }
    public void act() 
    {
        
        QuickSortWorld world=(QuickSortWorld)getWorld();
        if(!(world==null) && !world.getObjects(QuickSort.class).isEmpty()){
            if(mouseOnObject(this)) {
            this.setImage("tutorial_p.png");
            this.getImage().scale(100,120);
            }
        
            else{
                this.setImage("tutorial.png");
                this.getImage().scale(100,120);
            }
        }
      
        
        
        if(Greenfoot.mouseClicked(this)){
        
        String link = "https://youtu.be/LBiajXU_fAU";
        
        if(Desktop.isDesktopSupported()){
            try{
                Greenfoot.stop();
                Desktop.getDesktop().browse(new URI(link));
                
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        }
    }    
}
