package l;

public class Truck implements VehicleWithEngine{

    @Override
    public void startEngine() {
        System.out.println("Truck's engine started");
    }
    @Override
    public void move() {
        startEngine();
        System.out.println("Truck is moving");
    }
}
