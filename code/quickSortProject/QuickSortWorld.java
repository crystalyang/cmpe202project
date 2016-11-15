import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class initiates all objects.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuickSortWorld extends World
{
    protected boolean started = false;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public QuickSortWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 900, 1); 
        this.prepare();
    }
    
    private void prepare(){
        //QuickSort quickSort = new QuickSort();
        //addObject(quickSort, 367, 237);
       // quickSort.addedToWorld();
        
        Start start=new Start();
        start.setImage("start.png");
        start.getImage().scale(100,120);
        addObject(start,100,500);
        Reset reset = new Reset();
        reset.setImage("reset.png");
        reset.getImage().scale(100,120);
        addObject(reset,250,500);
        Choose_i c_i = new Choose_i();
        c_i.setImage("choosei.png");
        c_i.getImage().scale(100,120);
        addObject(c_i,400,500);
        Choose_j c_j = new Choose_j();
        c_j.setImage("choosej.png");
        c_j.getImage().scale(100,120);
        addObject(c_j,550,500);
        Swap swap = new Swap();
        swap.setImage("swap.png");
        swap.getImage().scale(100,120);
        addObject(swap,700,500);
        Next_Stage ns = new Next_Stage();
        ns.setImage("nextstage.png");
        ns.getImage().scale(100,120);
        addObject(ns,850,500);
        Controller controller = new Controller();
        addObject(controller,1,1);
        
    }
    
   
}
