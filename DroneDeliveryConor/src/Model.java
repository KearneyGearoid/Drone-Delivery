/**
 * Created by Conor on 07/12/2016.
 */
public enum Model {

    PHANTOM, TYPHOON;

    public String toString(){
        switch(this){
            case PHANTOM: return "Phantom";
            case TYPHOON: return "Typhoon";
        }

        return "not on system";
    }
}
