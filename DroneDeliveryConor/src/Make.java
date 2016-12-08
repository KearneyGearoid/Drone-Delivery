/**
 * Created by Conor on 07/12/2016.
 */
public enum Make {

    DJI, PARROT, YUNEEC;

    public String toString(){
        switch(this){
            case DJI: return "DJI";
            case PARROT: return "Parrot";
            case YUNEEC: return "Yuneec";
        }

        return "not on system";
    }
}
