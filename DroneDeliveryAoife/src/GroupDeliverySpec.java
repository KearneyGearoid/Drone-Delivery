import java.util.List;

/**
 * Created by t00180243 on 08/12/2016.
 */
public class GroupDeliverySpec {
    private DeliveryLocation deliveryLocation;
    private DeliveryCollection collectionLocation;
    private List<Double> packagesWeight;
    private List<Double> packagesDimensions;



    public GroupDeliverySpec(DeliveryLocation deliveryLocation, DeliveryCollection collectionLocation, List<Double> packagesWeight, List<Double> packagesDimensions) {
        this.deliveryLocation = deliveryLocation;
        this.collectionLocation = collectionLocation;
        this.packagesWeight = packagesWeight;
        this.packagesDimensions = packagesDimensions;

    }

    public DeliveryLocation getDeliveryLocation() {
        return deliveryLocation;
    }

    public DeliveryCollection getCollectionLocation() {
        return collectionLocation;
    }

    public List<Double> getPackagesWeight() {
        return packagesWeight;
    }

    public List<Double> getPackagesDimensions() {
        return packagesDimensions;
    }

    public boolean matches(GroupDeliverySpec otherSpec) {
        if (deliveryLocation != otherSpec.deliveryLocation)
            return false;

        if (collectionLocation != otherSpec.collectionLocation)
            return false;

        return true;
    }

}
