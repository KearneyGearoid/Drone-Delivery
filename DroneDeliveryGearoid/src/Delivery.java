/**
 * Created by Gearoid on 22/11/2016.
 */
public class Delivery {

        private static int numberOfDeliverys = 1;
        public int deliveryId = 1;
        String deliveryLocation;
        String collectionLocation;
        int weight;
        int droneId;
        String usernameCustomer;

    public Delivery(String deliveryLocation, String collectionLocation, int weight,String usernameCustomer, int droneId) {
        setDeliveryId(deliveryId);
        setDeliveryLocation(deliveryLocation);
        setCollectionLocation(collectionLocation);
        setWeight(weight);
        setUsernameCustomer(usernameCustomer);
        setDroneId(droneId);
        deliveryId =  numberOfDeliverys++;
    }

    public int getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(int deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getDeliveryLocation() {
        return deliveryLocation;
    }

    public void setDeliveryLocation(String deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }

    public String getCollectionLocation() {
        return collectionLocation;
    }

    public void setCollectionLocation(String collectionLocation) {
        this.collectionLocation = collectionLocation;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public int getDroneId() {
        return droneId;
    }

    public void setDroneId(int droneId) {
        this.droneId = droneId;
    }

    public String getUsernameCustomer() {
        return usernameCustomer;
    }

    public void setUsernameCustomer(String usernameCustomer) {
        this.usernameCustomer = usernameCustomer;
    }


}
