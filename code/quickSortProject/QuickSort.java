import greenfoot.*; 
import java.util.*;// (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 This class have sevearl responsibilities.
 1) create random numbers
 2) count the errors. When error number = 3, game ends.
 3) check whether user put number in the correct grid
 4) check whether the sorting operation for a pivot ends
 5) check whether game ends
 6) update grid background color according to game phase
 7) calculate operational numbers and correct sequence of them in the backend
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuickSort extends Actor
{

    int start;
    int end;

    //Message m = new Message();
    Number[] numbers= new Number[8];
    public int[] array = new int[8];
    
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
           array[i]=numbers[i].value;
        } 
    }
    
    
    public void act() 
    {
        // Add your action code here.
    } 
    //add number images to the world
    protected void addedToWorld(){ 
        QuickSortWorld world=(QuickSortWorld)getWorld();
        /* //Position class 
        int i=1;
        for(Number n: numbers){
            setPos(index++, i, world);
            i++;
        } */
        int index = 0;
        int i=1;
        // then add numbers
        for(Number n:numbers){
            GreenfootImage img = n.getImage();
            img.scale(img.getWidth()-35,img.getHeight()-57);
            world.addObject(n,110*i,200);
            // add pos image to the quicksort world.
            i+=1;
        }
    }
    
 
    //check error times
   // public int errorCount() {
    //}

    
}
