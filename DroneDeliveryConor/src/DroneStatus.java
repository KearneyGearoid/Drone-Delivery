/**
 * Created by Conor on 22/11/2016.
 */
public class DroneStatus {

    public Drone searchDrone(int droneId){

        return DroneFleet.searchDrone(droneId);

    }

    public void sendStatusRequest(Drone drone) {

        drone.replyStatusRequest();

    }
}
