import static org.junit.Assert.*;

/**
 * Created by Conor on 06/12/2016.
 */
public class DroneFleetTest {
    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void searchDrone() throws Exception {
        System.out.println("addDrone()");

        DroneFleet instance = new DroneFleet();
        DroneSpec droneSpec;
        Drone drone;

        droneSpec = new DroneSpec(12.5,50,30,"DJI","Phantom");
        drone = new Drone(1,droneSpec);
        instance.addDrone(drone);

        droneSpec = new DroneSpec(15.3,40,60,"Yuneec","Typhoon");
        drone = new Drone(2,droneSpec);
        instance.addDrone(drone);

        droneSpec = new DroneSpec(10,70,20,"Parrot","Debop");
        drone = new Drone(3,droneSpec);
        instance.addDrone(drone);

        DroneSpec expDroneSpec = new DroneSpec(15.3,40,60,"Yuneec","Typhoon");
        Drone expDrone = new Drone (2,expDroneSpec);

        Drone resultDrone = instance.searchDrone(expDrone);

        assertEquals(expDrone.getDroneId(),resultDrone.getDroneId());
    }

    @org.junit.Test
    public void addDrone() throws Exception {
        System.out.println("addDrone()");

        DroneFleet instance = new DroneFleet();
    }

    @org.junit.Test
    public void getDrone() throws Exception {
        System.out.println("getDrone()");

        DroneFleet instance = new DroneFleet();
    }

    @org.junit.Test
    public void removeDrone() throws Exception {
        System.out.println("addRemoveDrone()");

        DroneFleet instance = new DroneFleet();
    }

    @org.junit.Test
    public void sendStatusRequest() throws Exception {
        System.out.println("sendStatusRequest()");

        DroneFleet instance = new DroneFleet();
        DroneSpec droneSpec;
        Drone drone;
        String response;

        droneSpec = new DroneSpec(10,70,20,"Parrot","Debop");
        drone = new Drone(3,droneSpec);
        instance.addDrone(drone);

        response = instance.sendStatusRequest(drone);

        assertTrue(response.equals("I am ok"));
    }

}