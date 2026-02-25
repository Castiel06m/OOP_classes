package pr3.delivery.app;

import pr3.delivery.model.*;
import pr3.delivery.service.DeliveryService;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        Engine v8 = new Engine("V8 Diesel", 450);
        Engine electric = new Engine("Electric Dual-Motor", 300);

        Car myCar = new Car("Tesla Model 3", 500.0, electric, 5);
        Truck myTruck = new Truck("Volvo FH16", 1500.0, v8, 20000);

        //poly
        List<Vehicle> fleet = new ArrayList<>();
        fleet.add(myCar);
        fleet.add(myTruck);

        DeliveryService service = new DeliveryService();
        
        System.out.println("--- Fleet Information ---");
        service.printAllVehicles(fleet);

        System.out.println("\n--- Cost Calculations ---");
        System.out.println("Total Base Delivery Cost: $" + service.calculateTotalCost(fleet));
        
        System.out.println("Car cost with extra weight: $" + myCar.calculateDeliveryCost(100.0));
        System.out.println("Truck cost for long distance: $" + myTruck.calculateDeliveryCost(500.0, 1.5));
    }
}