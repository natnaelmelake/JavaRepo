public class Main {
    public static void main(String[] args) {
        
        Car car1 = new Car("Toyota");
        car1.displayCarDetails();
        
        System.out.println(); 

        
        Car car2 = new Car("Honda");
        car2.displayCarDetails();

        System.out.println(); 
        System.out.println("Accessing static variable directly using class name: " + Car.numberOfCars);
    }
}
