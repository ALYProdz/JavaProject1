public class VehicleRentalApp {
      
      public static void main(String[] args) {
            Car car = new Car("Toyota", "Camry", 2021, 4, "Petrol");
            Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2020, 2, "Cruiser");
            Truck truck = new Truck("Ford", "F-150", 2019, 2.5, "Automatic");
    
            System.out.println("Car Details:");
            System.out.println("Make: " + car.getMake());
            System.out.println("Model: " + car.getModel());
            System.out.println("Year: " + car.getYear());
            System.out.println("Number of Doors: " + car.getNumDoors());
            System.out.println("Fuel Type: " + car.getFuelType());
    
            System.out.println("\nMotorcycle Details:");
            System.out.println("Make: " + motorcycle.getMake());
            System.out.println("Model: " + motorcycle.getModel());
            System.out.println("Year: " + motorcycle.getYear());
            System.out.println("Number of Wheels: " + motorcycle.getNumWheels());
            System.out.println("Motorcycle Type: " + motorcycle.getMotorcycleType());
    
            System.out.println("\nTruck Details:");
            System.out.println("Make: " + truck.getMake());
            System.out.println("Model: " + truck.getModel());
            System.out.println("Year: " + truck.getYear());
            System.out.println("Cargo Capacity: " + truck.getCargoCapacity() + " tons");
            System.out.println("Transmission Type: " + truck.getTransmissionType());
        }  
}
