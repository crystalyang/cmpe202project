import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * This class initiates all objects.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuickSortWorld extends World implements Component
{
    protected boolean started = false;
    public int startTime; // update after click the start button, record in sec
    public int[] top3;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public QuickSortWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 1000, 1); 
        prepare();
    }
    public void initial(Button bl){
        // do nothing 
    }
    private void prepare(){

        ButtonFactory bf = new ButtonFactory();
        FactoryPart[] bls = new FactoryPart[7];
        bls[0] = bf.getStart();
        bls[0].setImage("start.png");
        bls[1] = bf.getReset();
        bls[1].setImage("reset.png");
        bls[2] = bf.getChoose_i();
        bls[2].setImage("choosei.png");
        bls[3] = bf.getChoose_j();
        bls[3].setImage("choosej.png");
        bls[4] = bf.getSwap();
        bls[4].setImage("swap.png");
        bls[5] = bf.getNext_Stage();
        bls[5].setImage("nextstage.png");
        bls[6] = bf.getTutorial();
        bls[6].setImage("tutorial.png");
        
        for(int i = 0; i < bls.length;i++){
            bls[i].initial(bls[i]);
            bls[i].getImage().scale(100,120);
            addObject(bls[i],100 + i* 130,450);
        }
        //int[] top3 = getRank(); //get the rank using API call from db
        //for sample purpose
        top3 = new int[]{89998,89998,89999};
        //sample [89998,89998,89999] integer in seconds
    }
    
   private GreenfootSound music = new GreenfootSound("music.mp3"); 
   public void started()  
   {  
        music.playLoop();  
   }  
   
    public void stopped()  
     {  
        music.stop();  
     } 
    
    public int[] getRank(){
        int[] top3 = new int[3];
        try{
            //change the path after deployment
            URL url = new URL("http://localhost:8080/getRank");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            if (conn.getResponseCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ conn.getResponseCode());
			}
			BufferedReader br = new BufferedReader(new InputStreamReader(
			(conn.getInputStream())));
    		String output;//{"ranks":[89998,89998,89999]} in seconds
    		
    		 
    		while ((output = br.readLine()) != null) {
    		    output = output.substring(10,output.length()-2);
    			System.out.println(output);
    			String[] ranksStr = output.split(",");
    			top3[0] = Integer.valueOf(ranksStr[0]);
    			System.out.println(top3[0]);
    			top3[1] = Integer.valueOf(ranksStr[1]);
    			System.out.println(top3[1]);
    			top3[2] = Integer.valueOf(ranksStr[2]);
    			System.out.println(top3[2]);
    		}
    		conn.disconnect();
        }
        catch (MalformedURLException e) {
    		e.printStackTrace();
        	  } catch (IOException e) {
        		e.printStackTrace();
    	  }
    	  
    	return top3;
    }

}
