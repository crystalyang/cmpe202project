import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
import java.awt.GraphicsEnvironment;
/**
 * Message info class 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.Color;
public class Message extends Actor implements Target
{
    /**
     * Act - do whatever the Message wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage img_m=new GreenfootImage("msg.png");
  
    private String content;
    
    private AdapteeObject adaptee;
    
    public void act() 
    {   
    } 
    
    public Message(){
        adaptee=new AdapteeObject();
    }
    
    

    public void sayChooseIJ(){
        QuickSortWorld world=(QuickSortWorld)getWorld();
        world.addObject(adaptee, 500, 680);
        adaptee.printMessage("Choose a number: click number then click  \n\"Select i\" or \"Select j\". I is before J.\nJ is smaller than pivot. I is reverse.\nTry to find the rule. Good Luck!");
    }
    
    public void saySwapSucceed(){
        adaptee.printMessage("  Great Job! \n  Go on with another i and j now.");
    }
    
    
    public void sayIChoosed(int i){
        adaptee.printMessage(i+"  is chosen for i.");
        
    }
    
     public void sayJChoosed(int j){
        adaptee.printMessage(j+"  is chosen for j.");
        
    }
    
    
     public void sayTimeMovePivot(){
        adaptee.printMessage("Time to move the pivot. Swap the duck\n number with the number after i.");
    }
    
    
    public void sayCannotSwapWithChance(int chance){
        adaptee.printMessage("  You cannot swap those them!\n      Try different numbers.\n   You have another "+chance+" chances.");
    }
    
     public void sayGameOver(){
        adaptee.printMessage("You tried five wrong swaps! \n Game End. Please reset and start again.");
    }
    
     public void sayNextStage(){
        adaptee.printMessage("Please click the Next Stage button.");
    }
    
      public void sayGameSucceed(){
        adaptee.printMessage("Congratulations! Quick Sort is completed!");
    }
    
       public void sayReadyForNextStage(){
        adaptee.printMessage("You are ready for the next stage! \n\n  Click the Next Stage Button");
    }
    
     public void sayNotReadyForNextStage(){
        adaptee.printMessage("You are not ready for the next stage!");
    }
    
    
    
    
    public Message(String m){
        img_m = this.getImage();
        img_m.setFont(new java.awt.Font("AppleGothic", java.awt.Font.PLAIN, 16));
        img_m.drawString(m,30,80);
        setImage(img_m);
        content = m;
    }
    
    public void setContent(String m){
        img_m = this.getImage();
        img_m.clear();
        this.setImage("msg.png");
        
        this.getImage().setFont(new Font("AppleGothic", Font.PLAIN, 16));
        this.getImage().drawString(m,30,80);
        content = m;
        //other color/font
    }
    
    public String getContent(){
        return content;
    }
    
    
       
}
