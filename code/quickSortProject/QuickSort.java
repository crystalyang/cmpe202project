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
    /**
     * Act - do whatever the QuickSort wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int pivot;
    int start;
    int end;
    //Message m = new Message();
    Number[] numbers=new Number[8];
    
    
    public QuickSort(){
     List<Integer> numberList=new ArrayList<>();
     Random rd=new Random();
     while(numberList.size()<8){
        int num=rd.nextInt(21);
        if(!numberList.contains(num)){
            numberList.add(num);
        }
        
        }
        
        Integer[] listRandom=numberList.toArray(new Integer[numberList.size()]);
        for(int i=0;i<listRandom.length;i++){
            numbers[i]=new Number((int)listRandom[i]);    
        }
    }
    
    
    
    
    public void act() 
    {
        // Add your action code here.
    } 
    //pick pivot in array
    //public int pickPivot(){
        
    //}    
    //move pivot to the position
    //public int movePivot() {
    //}
    //check if the number fits the position
    //public boolean check() {
    //}
    //check if it is the right time to end
    //public boolean caculate(int start, int end) {
    //}
    //check error times
   // public int errorCount() {
    //}

    
}
