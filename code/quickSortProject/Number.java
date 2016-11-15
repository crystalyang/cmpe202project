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
    // x, y indicate the position to which Number is dragged
    int x, y;
    //GreenfootImage image = this.getImage();
    //image.scale(70, 70);
    
    
    Number(int value) {
        this.value = value;
    }
    
    public String getFile(){
        return (this.value + ".png");
    }
    
    public void act() 
    {
        if(Greenfoot.mouseDragged(this)) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            int mouseX = mouse.getX();
            int mouseY = mouse.getY();
            this.setLocation(mouseX, mouseY);
        }
       // setImage(filename);
    }    
    
    
    
    //override equals
    public boolean equals(Number n_obj){
        return (n_obj.value==this.value); 
    }
    
}
