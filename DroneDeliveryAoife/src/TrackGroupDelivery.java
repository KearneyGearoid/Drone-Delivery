import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Aoife Horgan on 02/11/2016.
 */

public class TrackGroupDelivery {
    private List deliveries;


    public TrackGroupDelivery() {

        deliveries = new LinkedList();
    }

    public void addGroupDelivery(int id, String deliveryName, String deliveryLocation, String collectionLocation, List<Double> packagesWeight, List<Double> packagesDimensions, double deliveryCost, int numDeliveries) {
        GroupDelivery delivery = new GroupDelivery(id, deliveryName, deliveryLocation, collectionLocation, packagesWeight, packagesDimensions, deliveryCost, numDeliveries);
        deliveries.add(delivery);

    }

    public GroupDelivery getGroupDelivery(int deliveryId) {
        for (Iterator i = deliveries.iterator(); i.hasNext(); ) {


            GroupDelivery d = (GroupDelivery) i.next();
            if (d.getDeliveryId()==deliveryId) {
                return d;
            }
        }

        return null;
    }

    public List search(GroupDelivery searchDelivery) {
        List matchingDeliveries = new LinkedList<>();
        for (Iterator i = deliveries.iterator(); i.hasNext(); ) {
            GroupDelivery d = (GroupDelivery) i.next();
            if(d.getDeliveryName().matches(String.valueOf(searchDelivery)))

            matchingDeliveries.add(d);

        }
        return matchingDeliveries;
    }
}


















