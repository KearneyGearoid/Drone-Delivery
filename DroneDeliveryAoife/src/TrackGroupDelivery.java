/**
 * Created by Aoife Horgan on 02/11/2016.
 */

public class TrackGroupDelivery {
    private List deliveries;


    public TrackGroupDelivery() {

        deliveries = new LinkedList();
    }

    public void addGroupDelivery(int id, String deliveryName, String deliveryLocation, String collectionLocation, double packagesWeight, double packagesDimensions, double deliveryCost) {
        GroupDelivery delivery = new GroupDelivery(id, deliveryName, deliveryLocation, collectionLocation, packagesWeight, packagesDimensions, deliveryCost);
        deliveries.add(delivery);

    }

    public GroupDelivery getGroupDelivery(int deliveryId) {
        for (Iterator i = deliveries.iterator(); i.hasNext(); ) {


            GroupDelivery d = (GroupDelivery) i.next();
            if (d.getDeliveryId().equals(deliveryId)) {
                return d;
            }
        }

        return null;
    }

    public GroupDelivery search(GroupDelivery searchDelivery) {

        for (Iterator i = deliveries.iterator(); i.hasNext(); ) {
            GroupDelivery d = (GroupDelivery) i.next();
            String deliveryName = searchDelivery.getDeliveryName();
            if ((deliveryName != null) && (!deliveryName.equals("")) &&

                    (!deliveryName.equals(d.getDeliveryName())))
                continue;
            int id = searchDelivery.getDeliveryId();
            if ((id != null) &&

                    (!id = d.getDeliveryId()))
                continue;

        }
        return null;
    }
}
















}

