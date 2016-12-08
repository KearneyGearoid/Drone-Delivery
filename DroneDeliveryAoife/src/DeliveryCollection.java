/**
 * Created by t00180243 on 08/12/2016.
 */
public enum DeliveryCollection {
    TRALEE,KILLARNEY,CORK,DUBLIN,MAYO,LIMERICK;
    public String toString() {
        switch(this) {
            case TRALEE:   return "TRALEE";
            case KILLARNEY:   return "KILLARNEY";
            case CORK:   return "CORK";
            case DUBLIN: return "DUBLIN";
            case MAYO:    return "MAYO";
            case LIMERICK:     return "LIMERICK";
            default:       return "Unspecified";
        }
    }
}
