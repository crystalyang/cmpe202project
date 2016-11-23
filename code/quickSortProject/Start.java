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

    private List<Chance> chance_list= new ArrayList<Chance>();
    
    //@Override
    public void initial(Button start){
        start.setImage("start.png");
        start.getImage().scale(100,120);
    }
    
    public void act() 
    {
        // Add your action code here.
        clicked();
      
        if(mouseOnObject(this)) {
            this.setImage("start_p.png");
            this.getImage().scale(100,120);
        
        }
        else{
            this.setImage("start.png");
            this.getImage().scale(100,120);
        }
        
        
    }
    
    public List<Chance> get_chance_list(){
    
        return chance_list;
    }
    
    
     public void clicked(){
     if(Greenfoot.mouseClicked(this)) {
            QuickSortWorld world=(QuickSortWorld)getWorld();
            List<QuickSort> qs=getObjectsInRange(500,QuickSort.class);
            if(world.started == false){

                
                QuickSort quickSort = new QuickSort();
                world.addObject(quickSort, 367, 237);
                quickSort.addedToWorld();
                world.started = true;
             
                Pivot p = new Pivot();
                p.setImage("pivot2.png");
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
                
                Chance chance1 = new Chance();
                chance1.setImage("chance.png");
                chance1.getImage().scale(30,30);
                world.addObject(chance1,380,550);
                chance_list.add(chance1);
                Chance chance2 = new Chance();
                chance2.setImage("chance.png");
                chance2.getImage().scale(30,30);
                world.addObject(chance2,440,550);
                chance_list.add(chance2);
                Chance chance3 = new Chance();
                chance3.setImage("chance.png");
                chance3.getImage().scale(30,30);
                world.addObject(chance3,500,550);
                chance_list.add(chance3);
                Chance chance4 = new Chance();
                chance4.setImage("chance.png");
                chance4.getImage().scale(30,30);
                world.addObject(chance4,560,550);
                chance_list.add(chance4);
                Chance chance5 = new Chance();
                chance5.setImage("chance.png");
                chance5.getImage().scale(30,30);
                world.addObject(chance5,620,550);
                chance_list.add(chance5);
                
               
                Message msg=new Message();
                world.addObject(msg, 500, 680);
                msg.sayChooseIJ();

                Controller controller = new Controller();
                world.addObject(controller,1,1);
                
            }
        }
    }

    
    public void setNums(int index, int i, World world){
        
    }
        
}
