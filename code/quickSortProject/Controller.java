import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Controller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Controller extends Actor
{
    /**
     * Act - do whatever the Controller wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean control=true;
    List<int[]> result = new ArrayList<int[]>();
    List<Integer> pivots = new ArrayList<Integer>();
    List<Integer> stage_alert = new ArrayList<Integer>();
    public int stage=0;
    public Controller(){
        
    }
    
    public void act() 
    {
        // test code
        QuickSortWorld world=(QuickSortWorld)getWorld();
        if(!(world==null) && !world.getObjects(QuickSort.class).isEmpty() && control){
            QuickSort qs = world.getObjects(QuickSort.class).get(0);
            System.out.println("unsorted:");
            for(int i=0;i<8;i++){
                System.out.print(qs.array[i]+"  ");
            }
            System.out.println(" ");
            sort(qs.array);
            System.out.println("sorted:");
            for(int i=0;i<8;i++){
                System.out.print(qs.array[i]+"  ");
            }
            System.out.println(" ");
            for(int i=0;i<result.size();i++){
                int[] test = new int[2];
                test = result.get(i);
                System.out.print(test[0]+"  "+ test[1]+"\n");
            }
           
            control=false;
        }
        //test code end
    } 
      
    //quickSort
 
   
    public void sort(int[] A) {
 
        if (A == null || A.length == 0) {
            return;
        }
        Stack<Integer> stack = new Stack();
        stack.push(0);
        stack.push(A.length - 1);
        while (!stack.isEmpty()) {
            int r = stack.pop();
            int l = stack.pop();
            int p = partition(A, l, r);
            if (p + 1 < r) {
                stack.push(p + 1);
                stack.push(r);
            }
            if (p - 1 > l) {                                                           
                stack.push(l);
                stack.push(p - 1);
            }
            
        }
    }
    
    private int partition(int[] A, int start, int end) {
        if (start == end) {
            return start;
        }
        int left = start-1;
        int right = start;
        int pivot = A[end];
        pivots.add(pivot);
        for(right=start;right<end;right++){
            if(A[right]>pivot){
                continue;
            }
            else{
                left = left +1;
                if(left==right){
                    continue;
                }
                else{
                    swap(A,left,right, false);     
                }
                
            }
        }
        if(left+1!=end){
            swap(A,left+1,end, true);  
        }
        stage_alert.add(result.size());
        stage = stage+1;
        return left+1;
    }
    
    private void swap(int[] A, int i, int j, boolean stage_change) {
        if(stage_change){
            //n=stage_alert.get(0) when users swap the nth successfully, allows clicking the next stage
            
        }
        result.add(new int[]{A[i],A[j]});
        //System.out.println("operate switch:"+A[i]+"   "+A[j]);
        //System.out.println("stored switch:"+index[0]+"  "+index[1]);
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp; 
    }
}
