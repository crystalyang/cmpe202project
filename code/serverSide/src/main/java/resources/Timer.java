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


    public Timer(int idtimer, int duration){
        this.idtimer = idtimer;
        this.duration = duration;
    }

    public int getDuration(){
        return duration;
    }
}
