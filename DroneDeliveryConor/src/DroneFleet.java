import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Conor on 23/11/2016.
 */
public class DroneFleet {

    static LinkedList<Drone> drones = new LinkedList<>();

    public static Drone searchDrone(int Id){
        for(Iterator i = drones.iterator(); i.hasNext();){
            Drone drone = (Drone)i.next();
        }

        return null;
    }

    public void addDrone(Drone drone){

    }

    public void getDrone(int droneID){

    }

    public void removeDrone(Drone drone){

    }

}
