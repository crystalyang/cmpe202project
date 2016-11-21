/**
 * Write a description of class MPoweredOn here.usic
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MPoweredOff  implements MusicState
{

    

    public void changeState(MusicPlay musicPlay){
        musicPlay.setState(new MPoweredOn());
        musicPlay.getMusicSound().playLoop();
    }

}
