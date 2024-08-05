// Define the Vehicle interface
interface Vehicle {
      String getMake();
      String getModel();
      int getYear();
  }
  
  // Define the CarVehicle interface
  interface CarVehicle {
      int getNumDoors();
      String getFuelType();
  }
  
  // Define the MotorVehicle interface
  interface MotorVehicle {
      int getNumWheels();
      String getMotorcycleType();
  }
  
  // Define the TruckVehicle interface
  interface TruckVehicle {
      double getCargoCapacity();
      String getTransmissionType();
  }
  
  // Implement the Car class
  class Car implements Vehicle, CarVehicle {
      private String make;
      private String model;
      private int year;
      private int numDoors;
      private String fuelType;
  
      public Car(String make, String model, int year, int numDoors, String fuelType) {
          this.make = make;
          this.model = model;
          this.year = year;
          this.numDoors = numDoors;
          this.fuelType = fuelType;
      }
  
      @Override
      public String getMake() {
          return make;
      }
  
      @Override
      public String getModel() {
          return model;
      }
  
      @Override
      public int getYear() {
          return year;
      }
  
      @Override
      public int getNumDoors() {
          return numDoors;
      }
  
      @Override
      public String getFuelType() {
          return fuelType;
      }
  }
  
  // Implement the Motorcycle class
  class Motorcycle implements Vehicle, MotorVehicle {
      private String make;
      private String model;
      private int year;
      private int numWheels;
      private String motorcycleType;
  
      public Motorcycle(String make, String model, int year, int numWheels, String motorcycleType) {
          this.make = make;
          this.model = model;
          this.year = year;
          this.numWheels = numWheels;
          this.motorcycleType = motorcycleType;
      }
  
      @Override
      public String getMake() {
          return make;
      }
  
      @Override
      public String getModel() {
          return model;
      }
  
      @Override
      public int getYear() {
          return year;
      }
  
      @Override
      public int getNumWheels() {
          return numWheels;
      }
  
      @Override
      public String getMotorcycleType() {
          return motorcycleType;
      }
  }
  
  // Implement the Truck class
  class Truck implements Vehicle, TruckVehicle {
      private String make;
      private String model;
      private int year;
      private double cargoCapacity;
      private String transmissionType;
  
      public Truck(String make, String model, int year, double cargoCapacity, String transmissionType) {
          this.make = make;
          this.model = model;
          this.year = year;
          this.cargoCapacity = cargoCapacity;
          this.transmissionType = transmissionType;
      }
  
      @Override
      public String getMake() {
          return make;
      }
  
      @Override
      public String getModel() {
          return model;
      }
  
      @Override
      public int getYear() {
          return year;
      }
  
      @Override
      public double getCargoCapacity() {
          return cargoCapacity;
      }
  
      @Override
      public String getTransmissionType() {
          return transmissionType;
      }
  }
  
  // Main program
  /* public class VehicleRentalApp {
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
  }*/
  