public class VehicleRunner
{
  public static void main(String[] args)
  { 
    // testing all available methods on a Vehicle object
    Vehicle myVehicle = new Vehicle("Some Vehicle", 6);
    System.out.println(myVehicle.getName());
    System.out.println(myVehicle.getWheels());
    myVehicle.move(10);
    myVehicle.turn(90);
    myVehicle.brake(0.25);
    
    // testing all available methods on a Car object
    Car myCar = new Car("Honda Civic", 4, "leather");
    System.out.println(myCar.getName()); // inherited method
    System.out.println(myCar.getWheels()); // inherited method
    System.out.println(myCar.getFabric()); // method ONLY available on Car objects
    myCar.move(30); // inherited method
    myCar.turn(-90); // inherited method
    myCar.brake(0.50); // inherited method
    myCar.honk(); // method ONLY available on Car objects
    myCar.lockDoors(); // method ONLY available on Car objects
 
    // ---- WRITE YOUR TEST CODE BELOW! ----
    // testing all available methods on a Bicycle object
    
    Bicycle unicycle = new Bicycle("Unicycle", 1, 8);
    System.out.println(unicycle.getWheels());
    System.out.println(unicycle.getName());
    System.out.println(unicycle.getGearCount());
    unicycle.ringBells();
    unicycle.move(10);
    unicycle.turn(90);
    unicycle.brake(.5);

    UFO ufo = new UFO("X Æ A-12", 0, 12, 100);
    System.out.println(ufo.getName());
    System.out.println(ufo.getWheels());
    System.out.println(ufo.getNumberOfAliens());
    System.out.println(ufo.getRadius());
    ufo.move(Integer.MAX_VALUE);
    ufo.turn(359);
    ufo.brake(0.01);
    ufo.kidnap();
    ufo.flyBy();
    ufo.crash();
        
  }
}