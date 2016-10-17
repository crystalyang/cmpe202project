import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Number here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Number extends Actor
{
    int value;
    GreenfootImage image = this.getImage();
    //image.scale(70, 70);
    
    Number(int value) {
        this.value = value;
    }
    
    public void act() 
    {
        if(Greenfoot.mouseDragged(this)) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            int mouseX = mouse.getX();
            int mouseY = mouse.getY();
            this.setLocation(mouseX, mouseY);
        }
    }
    //@override
    // override getimage function, so we can get image file seperately.
    public void getImage(int number) {
        
    }
}
