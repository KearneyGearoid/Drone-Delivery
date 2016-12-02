
/**
 * Created by Aoife Horgan on 18/11/2016.
 */
public class GroupDelivery {

    private int deliveryId;
    private String deliveryName;
    private String deliveryLocation;
    private String collectionLocation;
    private List<Double> packagesWeight;
    private List<Double> packagesDimensions;
    private double deliveryCost;

    public GroupDelivery(int deliveryId, String deliveryName, String deliveryLocation, String collectionLocation, List<Double> packagesWeight, List<Double> packagesDimensions, double deliveryCost) {
        this.deliveryId = deliveryId;
        this.deliveryName = deliveryName;
        this.deliveryLocation = deliveryLocation;
        this.collectionLocation = collectionLocation;
        this.packagesWeight = new LinkedList<>();
        this.packagesDimensions = new LinkedList<>();
        this.deliveryCost = deliveryCost;
    }


    public int getDeliveryId() {
        return deliveryId;
    }

    public String getDeliveryName() {
        return deliveryName;
    }

    public String getDeliveryLocation() {
        return deliveryLocation;
    }

    public String getCollectionLocation() {
        return collectionLocation;
    }

    public List<Double> getPackagesWeight() {
        return packagesWeight;
    }

    public List<Double> getPackagesDimensions() {
        return packagesDimensions;
    }

    public double getDeliveryCost() {
        return deliveryCost;
    }







    public void setDeliveryCost(double deliveryCost) {
        this.deliveryCost = deliveryCost;
    }


}



