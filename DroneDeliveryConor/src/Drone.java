/**
 * Created by Conor on 22/11/2016.
 */
public class Drone {

    private int droneId;
    private DroneSpec spec;

    public Drone(int droneId, DroneSpec spec) {
        this.droneId = droneId;
        this.spec = spec;
    }

    public DroneSpec getSpec(){return spec; }

    public int getDroneId() {
        return droneId;
    }

    public void setDroneId(int droneId) {
        this.droneId = droneId;
    }

    public String replyStatusRequest(){
        return "I am ok";
    }

}
