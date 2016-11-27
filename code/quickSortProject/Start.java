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
            //System.out.print("1");
            QuickSortWorld world=(QuickSortWorld)getWorld();
            world.startTime = (int)((System.currentTimeMillis()/1000)%3600);
            System.out.println(world.startTime);
            List<QuickSort> qs=getObjectsInRange(500,QuickSort.class);
            if(world.started == false){
                
                QuickSort quickSort = new QuickSort();
                world.addObject(quickSort, 0, 0);
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
                
                Instruction ins = new Instruction();
                ins.setImage("ins.png");
                ins.getImage().scale(240,120);
                world.addObject(ins,250,620);
                Rank rank = new Rank();
                rank.setImage("rank.png");
                rank.getImage().scale(240,120);
                world.addObject(rank,750,620);

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
                msg.getImage().scale(400,400);
                world.addObject(msg, 340, 920);
                msg.sayChooseIJ();
                
               
                //int[] rank_number = world.getRank();
                int[] rank_i = new int[3];
                int[] remaining = new int[3];
                String rank_s = "";
                /*
                for(int i=0; i<rank_number.length; i++){                     
                    remaining[i] = rank_number[i]%60;
                    rank_i[i] = rank_number[i]/60;
                    rank_s += "Top"+ (i+1) + ": "+rank_i[i] + " min  " + remaining[i] + " sec\n";
                    System.out.println("function number"+rank_number[i]);
                    System.out.println("min number"+remaining[i]);
                    System.out.println("sec number"+rank_i[i]);
                } */
                int i, j;
                i=10000;
                j=50;
                remaining[0] = i%60;
                rank_i[0] = i/60;
                remaining[1] = j%60;
                rank_i[1] = j/60;
                rank_s += "1st: "+rank_i[0] + " min  " + remaining[0] + " sec\n\n" + "2nd: "+ rank_i[1] + " min  " + remaining[1] + " sec\n\n"+"3rd: 2 min  30 sec";
                Message rank_msg = new Message(rank_s);
                world.addObject(rank_msg,850,920);
                
                Controller controller = new Controller();
                world.addObject(controller,1,1);
                
            }
        }
    }

    
    public void setNums(int index, int i, World world){
        
    }
        
}
