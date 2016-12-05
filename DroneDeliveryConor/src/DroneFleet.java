import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Conor on 23/11/2016.
 */
public class DroneFleet {

    public List<Drone> drones = new LinkedList<>();

    public  Drone searchDrone(Drone drone){
        for(Iterator i = drones.iterator(); i.hasNext();){
            drone = (Drone) i.next();
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
