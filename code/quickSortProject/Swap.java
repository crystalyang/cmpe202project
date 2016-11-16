import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Swap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Swap extends Button
{
    /**
     * Act - do whatever the Swap wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
            clicked();
        }
    }   
    
    public void swapNumber(Number i, Number j){
        int i_x, i_y, j_x, j_y;
        i_x = i.getX();
        i_y = i.getY();
        j_x = j.getX();
        j_y = j.getY();
        i.setLocation(j_x,j_y);
        j.setLocation(i_x,i_y);
    }
    
    public void clicked(){
        QuickSortWorld world=(QuickSortWorld)getWorld();
        List<Choose_i> ci = world.getObjects(Choose_i.class);
        List<Choose_j> cj = world.getObjects(Choose_j.class);
        
        /*  //test code
        List<Number> num = world.getObjects(Number.class);
        for(Number n:num){
            if(n==ci.get(0).number_i){
                System.out.println(ci.get(0).number_i.value +"value for i get");
            }
            if(n==cj.get(0).number_j){
                System.out.println(cj.get(0).number_j.value +"value for j get");
            }
        } */
        if(ci.get(0).check_i && cj.get(0).check_j){
            swapNumber(ci.get(0).number_i,cj.get(0).number_j);
        }
    }
}
