import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Aoife Horgan on 02/11/2016.
 */

public class FindGroupDeliveryTester{

    public static List<Double> weights;
    public static List<Double> dimensions;
    public static void main(String[] args){

        TrackGroupDelivery delivery = new TrackGroupDelivery();
        //initializeTrackGroupDelivery(delivery);
        weights = new LinkedList<>();
        dimensions = new LinkedList<>();
        weights.add(40.27);
        weights.add(20.87);

        dimensions.add(15.6);
        dimensions.add(10.0);
        GroupDeliverySpec spec = new GroupDeliverySpec(DeliveryLocation.KILLARNEY,DeliveryCollection.CORK,weights,dimensions);
        GroupDelivery deliverySample = new GroupDelivery(1,"Sample Delivery",2,40.00,spec);


        List deliveryMatching = delivery.search(deliverySample);
        if(!deliveryMatching.isEmpty()){
            System.out.println("List of deliveries");
            for(Iterator i = deliveryMatching.iterator(); i.hasNext();){
                GroupDelivery del = (GroupDelivery)i.next();
                System.out.println("Delivery Information: " + "\nDelivery Id: " + del.getDeliveryId() + "\nDelivery Name: " +
                del.getDeliveryName() + "\nDelivery Cost: " + del.getDeliveryCost());
            }
        }else
            System.out.println("No deliveries");

    }

}