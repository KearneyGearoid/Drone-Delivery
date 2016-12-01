/**
 * Created by Conor on 22/11/2016.
 */
public class DroneStatus {

    private DroneFleet droneFleet;

    public DroneStatus(DroneFleet droneFleet) {
        this.droneFleet = droneFleet;
    }

    public Drone searchDrone(Drone drone){

        return droneFleet.searchDrone(drone);

    }

    public void sendStatusRequest(Drone drone) {

        drone.replyStatusRequest();

    }
}
