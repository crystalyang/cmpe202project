import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class initiates all objects.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuickSortWorld extends World
{

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
        QuickSort quickSort = new QuickSort();
        addObject(quickSort, 367, 237);
        quickSort.addedToWorld();
        Start start=new Start();
        addObject(start,400,500);
        addObject(new Reset(),600,500);
        
        
    }
}
