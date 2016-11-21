import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Music here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Music extends Button
{
    /**
     * Act - do whatever the Music wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    //@Override
    public void initial(Button bl) 
    {
        
    }
    
    private MusicPlay mp;
    private boolean play;
    public void act() 
    {
       clicked();
    }

    public Music(){
        mp=new MusicPlay("music.mp3");
    }
    
    public void clicked(){
        if(Greenfoot.mouseClicked(this)) {
            mp.changeState();
        }
    }
    
    
    
}
