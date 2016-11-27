
public class Drone {
    private static int numberOfDrones = 1;
    public int droneId = 1;
    public int loadCapacity;
    public int range;
    public int speed;
    public String status;

    public Drone() {
        setDroneId(droneId);
        setLoadCapacity(0);
        setRange(0);
        setSpeed(0);
        setStatus("Inactive");

        droneId =  numberOfDrones++;
    }

    public Drone( int loadCapacity, int range, int speed, String status) {
        setDroneId(droneId);
        setLoadCapacity(loadCapacity);
        setRange(range);
        setSpeed(speed);
        setStatus(status);

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
}
