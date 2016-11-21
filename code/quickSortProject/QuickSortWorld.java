import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
        Button[] bls = new Button[7];
        bls[0] = new Start();
        bls[1] = new Reset();
        bls[2] = new Choose_i();
        bls[3] = new Choose_j();
        bls[4] = new Swap();
        bls[5] = new Next_Stage();
        bls[6] = new Tutorial();
        for(int i = 0; i < bls.length;i++){
            bls[i].initial(bls[i]);
            addObject(bls[i],100 + i* 130,450);
        }
        //QuickSort quickSort = new QuickSort();
        //addObject(quickSort, 367, 237);
       // quickSort.addedToWorld();
        
        /*Start start=new Start();
        start.setImage("start.png");
        start.getImage().scale(100,120);
        addObject(start,100,450);
        Reset reset = new Reset();
        reset.setImage("reset.png");
        reset.getImage().scale(100,120);
        addObject(reset,230,450);
        Choose_i c_i = new Choose_i();
        c_i.setImage("choosei.png");
        c_i.getImage().scale(100,120);
        addObject(c_i,360,450);
        Choose_j c_j = new Choose_j();
        c_j.setImage("choosej.png");
        c_j.getImage().scale(100,120);
        addObject(c_j,490,450);
        Swap swap = new Swap();
        swap.setImage("swap.png");
        swap.getImage().scale(100,120);
        addObject(swap,620,450);
        Next_Stage ns = new Next_Stage();
        ns.setImage("nextstage.png");
        ns.getImage().scale(100,120);
        addObject(ns,750,450);
        Tutorial t = new Tutorial();
        t.setImage("tutorial.png");
        t.getImage().scale(100,120);
        addObject(t,880,450);*/
        
        
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
