import greenfoot.*; 
import java.util.*;// (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuickSort extends Actor
{

    private int start;
    private int end;

    //Message m = new Message();
    private Number[] numbers= new Number[8];
    private int[] array = new int[8];
    
    public QuickSort(){
        Set<Number> set = new HashSet<>();   
        boolean check_set;
        while (set.size() < 8) {
            check_set=true;
            Number rd = new Number((int)(Math.random() * 21));
            for(Iterator<Number> i=set.iterator();i.hasNext();){
                Number f=i.next();
               if(f.equals(rd)){
                   check_set=false;
                   break;
                }
            }
            if(check_set){
                //System.out.println(rd.value);
                set.add(rd);
                //System.out.println(rd.getFile());
                rd.setImage(rd.getFile());
            }
        }
        numbers = set.toArray(new Number[8]);
       // addedToWorld();
       for(int i=0;i<8;i++){
           array[i]=numbers[i].getValue();
        } 
    }
    
    
    public void act() 
    {
        // Add your action code here.
    } 
    //add number images to the world
    protected void addedToWorld(){ 
        QuickSortWorld world=(QuickSortWorld)getWorld();
        int index = 0;
        int i=1;
        // then add numbers
        for(Number n:numbers){
            GreenfootImage img = n.getImage();
            img.scale(img.getWidth()-35,img.getHeight()-57);
            world.addObject(n,110*i,200);
            i+=1;
        }
    }
    
    
    public int[] getArray(){
        return array;
    
    }
    
}
