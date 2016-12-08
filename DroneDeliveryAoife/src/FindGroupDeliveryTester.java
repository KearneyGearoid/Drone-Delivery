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

        GroupDelivery deliverySample = new GroupDelivery(1,"Sample Delivery","Tralee" ,"Killarney" ,weights,dimensions,40.00,1);


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
    private static void initializeInventory(TrackGroupDelivery inventory) {
        inventory.addGroupDelivery(2,"Sample Delivery","Tralee" ,"Killarney" ,weights,dimensions,40.00,1);
        inventory.addGroupDelivery(2,"Sample Delivery","Killarney" ,"Tralee" ,weights,dimensions,40.00,2);
        inventory.addGroupDelivery(3,"Sample Delivery","Cork" ,"Tralee" ,weights,dimensions,40.00,2);
        inventory.addGroupDelivery(4,"Sample Delivery","Mayo" ,"Tralee" ,weights,dimensions,40.00,1);
        inventory.addGroupDelivery(5,"Sample Delivery","Dublin" ,"Tralee" ,weights,dimensions,40.00,2);

    }
}