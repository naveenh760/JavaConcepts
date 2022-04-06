package interfaces.vehicles;

public class Car implements Vehicle{
    @Override
    public void cleanVehicle() {
        System.out.println("cleaning the car");
    }
}
