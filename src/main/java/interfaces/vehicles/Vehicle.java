package interfaces.vehicles;

public interface Vehicle {
    void cleanVehicle();
    static void parkVehicle(){
        System.out.println("Parking vehicle");
    }

    default void startVehicle(){
        System.out.println("vehicle is starting");

    }
}
