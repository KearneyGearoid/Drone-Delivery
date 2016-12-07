/**
 * Created by Conor on 06/12/2016.
 */
public class DroneSpec {

    private double loadCapacity;
    private double range;
    private double speed;
    private String make;
    private String model;

    public DroneSpec(double loadCapacity, double range, double speed, String make, String model) {
        this.loadCapacity = loadCapacity;
        this.range = range;
        this.speed = speed;
        this.make = make;
        this.model = model;
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

}
