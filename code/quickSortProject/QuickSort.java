import greenfoot.*; 
import java.util.*;// (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class QuickSort here.
 * 
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
    //Message m = new Message();
    Number[] numbers;
    public QuickSort() {
        Set<Number> set = new HashSet<>();
        while(set.size() < 8) {
            int n = (int)Math.random() * 20;
            Number number = new Number(n);
            set.add(number);
        }
        numbers = set.toArray(new Number[set.size()]);
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
