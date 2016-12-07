import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Conor on 23/11/2016.
 */
public class DroneFleet {

    public List<Drone> drones = new LinkedList<>();

    public  Drone searchDrone(Drone droneSearch){
        for(Iterator i = drones.iterator(); i.hasNext();){
            Drone drone = (Drone) i.next();
            if(droneSearch.getDroneId() == drone.getDroneId()){
                return drone;
            }
        }
        return null;
    }

    public void addDrone(Drone drone){
        drones.add(drone);
    }

    public void removeDrone(Drone drone){
        drones.remove(drone);
    }

    public void getDrone(Drone drone){
        drones.get(drone.getDroneId());
    }

    public void sendStatusRequest(Drone drone) {

        drone.replyStatusRequest();

    }
}
