import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Button extends FactoryPart implements Component
{
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
  
    public void initial(FactoryPart bl)
    {

    }
    public Button(){
        GreenfootImage img = getImage();
        img.scale(70,70);
    }

    public boolean mouseOnObject(Actor obj)
    { 
        MouseInfo mi = Greenfoot.getMouseInfo();
        if(mi!= null){
            int actorX = obj.getX(), actorY = obj.getY();
            int actorWide = obj.getImage().getWidth(), actorHigh = obj.getImage().getHeight();
            boolean check1 = mi.getX() >= actorX - actorWide / 2;
            boolean check2 = mi.getY() >= actorY - actorHigh / 2;
            boolean check3 = mi.getX() <= actorX + actorWide / 2;
            boolean check4 = mi.getY() <= actorY + actorHigh / 2;
            return check1 && check2 && check3 && check4;
        }
        else{
            return false;
        }
    }

}
