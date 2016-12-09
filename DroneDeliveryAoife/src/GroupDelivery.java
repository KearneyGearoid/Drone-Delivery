import java.util.LinkedList;
import java.util.List;

/**
 * Created by Aoife Horgan on 18/11/2016.
 */
public class GroupDelivery {

    private int deliveryId;
    private String deliveryName;
    private int numDeliveries;
    private double deliveryCost;
    GroupDeliverySpec spec;


    public GroupDelivery(int deliveryId, String deliveryName, int numDeliveries, double deliveryCost, GroupDeliverySpec spec) {
        this.deliveryId = deliveryId;
        this.deliveryName = deliveryName;
        this.numDeliveries = numDeliveries;
        this.deliveryCost = deliveryCost;
        this.spec = spec;
    }

    public int getDeliveryId() {
        return deliveryId;
    }

    public String getDeliveryName() {
        return deliveryName;
    }

    public int getNumDeliveries() {
        return numDeliveries;
    }

    public double getDeliveryCost() {
        return deliveryCost;
    }

    public void setDeliveryCost(double deliveryCost) {
        this.deliveryCost = deliveryCost;
    }
    public GroupDeliverySpec getSpec() {
        return spec;
    }
}



