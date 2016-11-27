

import javax.swing.*;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Gearoid on 27/11/2016.
 */
public class DriverClass {
    public static void main(String args[]) {

        String deliveryLocation;
        String collectionLocation;
        int weight;
        String username;
        int droneId;

        Sender sender1 = new Sender("Conor Kearns", "conor01", "conor1", "Killarney, Kerry, Ireland", "0879916328");

        Drone drone1 = new Drone(100, 50, 40, "Active", "DJI 100");
        Drone drone2 = new Drone(200, 50, 40, "Active", "DJI 200");
        LinkedList<Drone> drones = new LinkedList<>();

        drones.add(drone1);
        drones.add(drone2);

        collectionLocation = JOptionPane.showInputDialog("Collection Location: ");
        deliveryLocation = JOptionPane.showInputDialog("Delivery Location");
        weight = Integer.parseInt(JOptionPane.showInputDialog("Parcel Weight: "));
        username = JOptionPane.showInputDialog("Username: ");

        int availableDrone = 0;

        for (Drone element : drones) {

            if (weight <= element.getLoadCapacity() && element.getStatus().equals("Active")) {
                System.out.println("Available Drone is " + element.getDroneId() + "\n ");
                availableDrone = element.getDroneId();
                break;
            }

        }

        if(availableDrone <= 0)
        {
            System.out.print("No Drones Available");
        }else {
            Delivery newDelivery = new Delivery(collectionLocation, deliveryLocation,weight,username,availableDrone);

            System.out.print(newDelivery.getDroneId());

        }





    }
}
