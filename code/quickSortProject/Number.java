import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class has three responsibilities:
 * 1)records the value created randomly by QuckSort.
 * 2)records the position of the number after it is moved.
 * 3)creates image based on the random number
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Number extends Actor
{
    int value;
    int position;
    //GreenfootImage image = this.getImage();
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
