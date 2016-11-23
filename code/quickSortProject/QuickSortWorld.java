import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * This class initiates all objects.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuickSortWorld extends World implements Component
{
    protected boolean started = false;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public QuickSortWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 1000, 1); 
        prepare();
    }
    public void initial(Button bl){
        // do nothing 
    }
    private void prepare(){

        ButtonFactory bf = new ButtonFactory();
        FactoryPart[] bls = new FactoryPart[7];
        bls[0] = bf.getStart();
        bls[0].setImage("start.png");
        bls[1] = bf.getReset();
        bls[1].setImage("reset.png");
        bls[2] = bf.getChoose_i();
        bls[2].setImage("choosei.png");
        bls[3] = bf.getChoose_j();
        bls[3].setImage("choosej.png");
        bls[4] = bf.getSwap();
        bls[4].setImage("swap.png");
        bls[5] = bf.getNext_Stage();
        bls[5].setImage("nextstage.png");
        bls[6] = bf.getTutorial();
        bls[6].setImage("tutorial.png");
        
        for(int i = 0; i < bls.length;i++){
            bls[i].initial(bls[i]);
            bls[i].getImage().scale(100,120);
            addObject(bls[i],100 + i* 130,450);
        }
 
    }
    
   private GreenfootSound music = new GreenfootSound("music.mp3"); 
   public void started()  
   {  
        music.playLoop();  
   }  
   
    public void stopped()  
     {  
        music.stop();  
     } 
}
