import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.*;
/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Button
{
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        clicked();
    }
    
     public void clicked(){
     if(Greenfoot.mouseClicked(this)) {
             QuickSortWorld world=(QuickSortWorld)getWorld();
            //List<QuickSort> qs=getObjectsInRange(500,QuickSort.class);
            //qs.get(0).addedToWorldNextLine();
            if(world.started == false){
                //int index=0;
                //for(int j=0;j<8;j++){
                    //setPos(index++, j+1, world);
                //}
                
                QuickSort quickSort = new QuickSort();
                world.addObject(quickSort, 367, 237);
                quickSort.addedToWorld();
                world.started = true;
             
                Pivot p = new Pivot();
                p.setImage("pivot.png");
                p.getImage().scale(80,110);
                world.addObject(p,860,320);
                Marker_i m_i = new Marker_i();
                m_i.setImage("i.png");
                m_i.getImage().scale(50,100);
                world.addObject(m_i,15,100);
                Marker_j m_j = new Marker_j();
                m_j.setImage("j.png");
                m_j.getImage().scale(50,100);
                world.addObject(m_j,100,100);
                
                Message msg = new Message("Please choose i and j.");
                msg.setImage("msg.png");
                msg.getImage().scale(msg.getImage().getWidth()-35,msg.getImage().getHeight()-100);
                world.addObject(msg, 500, 400);
                Controller controller = new Controller();
                world.addObject(controller,1,1);
            }
        }
    }
    
    // clean up later
    // public void addedToWorldNextLine(){
        // QuickSortWorld world=(QuickSortWorld)getWorld();
        // int index=0;
        // for(int j=0;j<8;j++){
            // setPos(index++, j+1, world);
        // }
    // }
   
    
    //public void setPos(int index, int i, World world) {
           // Position pos = new Position(index);
            //pos.setImage(pos.getFile());
           // GreenfootImage posImg = pos.getImage();
           // posImg.scale(posImg.getWidth() - 660, posImg.getHeight() - 625);
            //world.addObject(pos, 110 * i, 250);
   // }
    
    
    
    public void setNums(int index, int i, World world){
        
    }
        
}
