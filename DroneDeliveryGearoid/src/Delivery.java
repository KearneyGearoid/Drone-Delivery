/**
 * Created by Gearoid on 22/11/2016.
 */
public class Delivery {
        int deliveryId = 0;
        String deliveryLocation;
        String collectionLocation;
        int weight;

    public Delivery(int deliveryId, String deliveryLocation, String collectionLocation, int weight) {
        this.deliveryId = deliveryId;
        this.deliveryLocation = deliveryLocation;
        this.collectionLocation = collectionLocation;
        this.weight = weight;
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
