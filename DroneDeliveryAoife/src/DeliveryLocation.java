/**
 * Created by t00180243 on 08/12/2016.
 */
public enum DeliveryLocation {
    TRALEE,KILLARNEY,CORK,DUBLIN,MAYO,LIMERICK,CLARE,TIPPERARY,GALWAY;
    public String toString() {
        switch(this) {
            case TRALEE:   return "TRALEE";
            case KILLARNEY:   return "KILLARNEY";
            case CORK:   return "CORK";
            case DUBLIN: return "DUBLIN";
            case MAYO:    return "MAYO";
            case CLARE:     return "CLARE";
            case LIMERICK:     return "LIMERICK";
            case TIPPERARY:     return "TIPPERARY";
            case GALWAY:     return "GALWAY";
            default:       return "Unspecified";
        }
    }
}
