/**
 * Created by Conor on 22/11/2016.
 */
public class Drone {

    private double loadCapacity, range, speed;
    private String make, model;
    private int droneId;

    public Drone(double loadCapacity, double range, double speed, String make, String model, int droneId) {
        this.loadCapacity = loadCapacity;
        this.range = range;
        this.speed = speed;
        this.make = make;
        this.model = model;
        this.droneId = droneId;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

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
