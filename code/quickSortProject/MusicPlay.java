import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MusicPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MusicPlay extends Actor
{
    private MusicState musicState;
    private GreenfootSound musicSound;
    
    public MusicPlay(String musicFile){
        musicSound = new GreenfootSound(musicFile); 
        musicState=new MPoweredOff();
    }
    
    
    public void setState(MusicState s){
        musicState=s;
    }
    
    public void changeState(){
        musicState.changeState(this);
    }
    
    public GreenfootSound getMusicSound(){
        return musicSound;
    }
    
    
}
