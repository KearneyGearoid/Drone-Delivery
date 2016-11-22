
public class Drone {
    public int droneId = 0;
    public int loadCapacity;
    public int range;
    public int speed;
    public String status;

    public Drone(int droneId, int loadCapacity, int range, int speed, String status) {
        this.droneId = droneId++;
        this.loadCapacity = loadCapacity;
        this.range = range;
        this.speed = speed;
        this.status = status;
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
