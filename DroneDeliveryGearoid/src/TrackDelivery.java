import java.util.LinkedList;
import java.util.List;

/**
 * Created by Gearoid on 27/11/2016.
 */
public class TrackDelivery {

    static List<Delivery> deliveries = new LinkedList<>();

    public static String searchDeliveries(int DeliveryId){
        for (Delivery element : deliveries) {

            if (DeliveryId == element.getDeliveryId()) {
                return "Delivery Id: " + element.getDeliveryId() + "\nDelivery Location: " + element.getDeliveryLocation() + "\nCollection Location: " + element.getCollectionLocation()
                        + "\nWeight" + element.getWeight();
            }

        }
        return "There is no delivery with this id " + DeliveryId + "";
    }

    public static void addDelivery(Delivery newDelivery){
        deliveries.add(newDelivery);
    }


}
