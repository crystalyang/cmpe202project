package resources;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Crystal on 11/23/16.
 */
@Entity
@Table(name ="timer")
public class Timer {
    @Id
    @GeneratedValue
    @Column(name = "idtimer")
    private int idtimer;

    @Column(name = "duration")
    private int duration; //record as seconds


    public Timer(int duration){

        this.duration = duration;
    }

    public Timer(){}

    public int getDuration(){
        return duration;
    }
}
