package abstracts;
import interfaces.FarmVehicle;

public abstract class Tractor implements FarmVehicle {
    public void harvest(Crop crop){
        this.crop = crop;
    }
}
