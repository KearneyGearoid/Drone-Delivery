/**
 * Created by Gearoid on 09/12/2016.
 */
public enum Make {
    DJI100, DJI300, DJI250;

    public String toString(){
        switch(this){
            case DJI100: return "DJI 100";
            case DJI300: return "DJI 300";
            case DJI250: return "DJI 250";
        }

        return "This model does not exist on the system";
    }

}

