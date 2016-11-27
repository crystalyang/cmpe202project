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
    private int value;
    private boolean clicked;
    
    Number(int value) {
        this.value = value;
        this.clicked=false;
    }
    
    public String getFile(){
        return (this.value + ".png");
    }
    
    public int getValue(){
        return value;
    }
    public void setValue(int _value){
          value=_value;
   
    }
    
    public void act() 
    {
        
    }    
    
    //override equals
    public boolean equals(Number n_obj){
        return (n_obj.value==this.value); 
    }
    
    
    //when the number is clicked, renew the clicked attribute, Aim to choose i, choose j
    public void checkClicked(){
    
       if(Greenfoot.mouseClicked(this)) {
       clicked=true; 
       }
    }
}
