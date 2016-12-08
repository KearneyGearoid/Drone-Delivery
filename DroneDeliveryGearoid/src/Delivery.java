/**
 * Created by Gearoid on 22/11/2016.
 */
public class Delivery {

        private static int numberOfDeliverys = 1;
        public int deliveryId = 1;
        String deliveryLocation;
        String collectionLocation;
        int weight;

    public Delivery(String deliveryLocation, String collectionLocation, int weight) {
        setDeliveryId(deliveryId);
        setDeliveryLocation(deliveryLocation);
        setCollectionLocation(collectionLocation);
        setWeight(weight);

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
}
