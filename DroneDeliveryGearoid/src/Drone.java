import java.util.LinkedList;
import java.util.List;

public class Drone {
    private static int numberOfDrones = 1;
    public int droneId = 1;
    public int loadCapacity;
    public int range;
    public int speed;
    public String status;
    public Make make;

    public Drone() {
        setDroneId(droneId);
        setLoadCapacity(0);
        setRange(0);
        setSpeed(0);
        setStatus("Inactive");

        droneId =  numberOfDrones++;
    }

    public Drone( int loadCapacity, int range, int speed, String status, Make make) {
        setDroneId(droneId);
        setLoadCapacity(loadCapacity);
        setRange(range);
        setSpeed(speed);
        setStatus(status);
        setMake(make);

        droneId =  numberOfDrones++;
    }

    public int getDroneId() {
        return droneId;
    }

    public void setDroneId(int id) {
        this.droneId = id;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Make getMake() {
        return make;
    }

    public void setMake(Make make) {
        this.make = make;
    }

    public static int availableDrones(List<Drone> drones, int weight){

        int availableDrone = 0;

        for (Drone element : drones) {

            if (weight <= element.getLoadCapacity() && element.getStatus().equals("Active")) {
                System.out.println("Available Drone is " + element.getDroneId() + "\n ");
                availableDrone = element.getDroneId();
                break;
            }

        }
        return availableDrone;
    }

}
