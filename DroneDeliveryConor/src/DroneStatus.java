/**
 * Created by Conor on 22/11/2016.
 */
public class DroneStatus {

    int droneId;

    public DroneStatus(int droneId){
        this.droneId = droneId;
    }

    public Drone searchDrone(){
        return DroneFleet.searchDrone(this.droneId);
    }

    public void sendStatusRequest(Drone drone) {

        drone.replyStatusRequest();
    }

    public void setDroneId(int droneId) {
        this.droneId = droneId;
    }
}
