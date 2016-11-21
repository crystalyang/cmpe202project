/**
 * Write a description of class MPoweredOn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MPoweredOn implements MusicState
{
    public void changeState(MusicPlay music){
        music.setState(new MPoweredOff());
        music.getMusicSound().stop();
    }

}
