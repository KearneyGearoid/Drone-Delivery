import java.util.List;

/**
 * Created by Aoife Horgan on 18/11/2016.
 */
public class GroupDelivery extends RegisteredUser {

    private int deliveryId;
    private List<RegisteredUser> users;
    private String deliveryName;
    private String deliveryLocation;
    private String collectionLocation;
    private double packagesWeight;
    private double packagesDimensions;
    private double deliveryCost;

    public GroupDelivery(List<RegisteredUser> users, String deliveryName, String deliveryLocation, String collectionLocation, double packagesWeight, double packagesDimensions, double deliveryCost) {
        users = new LinkedList<>();
        this.deliveryName = deliveryName;
        this.deliveryLocation = deliveryLocation;
        this.collectionLocation = collectionLocation;
        this.packagesWeight = packagesWeight;
        this.packagesDimensions = packagesDimensions;
        this.deliveryCost = deliveryCost;
    }


    public int getDeliveryId() {
        return deliveryId;
    }

    public List<RegisteredUser> getUsers() {
        return users;
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

    public double getPackagesWeight() {
        return packagesWeight;
    }

    public double getPackagesDimensions() {
        return packagesDimensions;
    }

    public double getDeliveryCost() {
        return deliveryCost;
    }


    public void addUser(String username,String userFullName,String address,String password,int phoneNumber){
        RegisteredUser user = new RegisteredUser(username, userFullName, address,password,phoneNumber);
       users.add(user);

    }



    public void setDeliveryCost(double deliveryCost) {
        this.deliveryCost = deliveryCost;
    }
}



