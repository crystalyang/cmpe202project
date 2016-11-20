import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Reset here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reset extends Button
{
    /**
     * Act - do whatever the Reset wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        QuickSortWorld world=(QuickSortWorld)getWorld();
        if(!(world==null) && !world.getObjects(QuickSort.class).isEmpty()){
            if(mouseOnObject(this)) {
                this.setImage("reset_p.png");
                this.getImage().scale(100,120);
            }
            else{
                this.setImage("reset.png");
                this.getImage().scale(100,120);
            } 
        }
        
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new QuickSortWorld());
             
        }// Add your action code here.
    }    
    
}
