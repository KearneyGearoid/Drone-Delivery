/**
 * Created by Aoife Horgan on 18/11/2016.
 */
public class Delivery {

    private int deliveryId, regUsersNumbers;
    private String deliveryName, deliveryLocation, collectionLocation, regUsersNames;
    private double packagesWeight, packagesDimensions, deliveryCost;

    public Delivery(int deliveryId, int regUsersNumbers, String deliveryName, String deliveryLocation, String collectionLocation, String regUsersNames, double packagesWeight, double packagesDimensions, double deliveryCost) {
        this.deliveryId = deliveryId;
        this.regUsersNumbers = regUsersNumbers;
        this.deliveryName = deliveryName;
        this.deliveryLocation = deliveryLocation;
        this.collectionLocation = collectionLocation;
        this.regUsersNames = regUsersNames;
        this.packagesWeight = packagesWeight;
        this.packagesDimensions = packagesDimensions;
        this.deliveryCost = deliveryCost;
    }

    public int getDeliveryId() {
        return deliveryId;
    }

    public int getRegUsersNumbers() {
        return regUsersNumbers;
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

    public String getRegUsersNames() {
        return regUsersNames;
    }

    public double getPackagesWeight() {
        return packagesWeight;
    }

    public double getPackagesDimensions() {
        return packagesDimensions;
    }

    public double getDeliveryCost() {
        return deliveryCost;
    }

    public void setDeliveryId(int deliveryId) {
        this.deliveryId = deliveryId;
    }

    public void setRegUsersNumbers(int regUsersNumbers) {
        this.regUsersNumbers = regUsersNumbers;
    }

    public void setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName;
    }

    public void setDeliveryLocation(String deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }

    public void setCollectionLocation(String collectionLocation) {
        this.collectionLocation = collectionLocation;
    }

    public void setRegUsersNames(String regUsersNames) {
        this.regUsersNames = regUsersNames;
    }

    public void setPackagesWeight(double packagesWeight) {
        this.packagesWeight = packagesWeight;
    }

    public void setPackagesDimensions(double packagesDimensions) {
        this.packagesDimensions = packagesDimensions;
    }

    public void setDeliveryCost(double deliveryCost) {
        this.deliveryCost = deliveryCost;
    }

}


