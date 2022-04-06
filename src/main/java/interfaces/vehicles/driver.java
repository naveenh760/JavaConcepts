package interfaces.vehicles;

public class driver {

    public static void main(String[] args){
        Vehicle car = new Car();
        car.cleanVehicle();
        car.startVehicle();
        Vehicle.parkVehicle();
    }
}
