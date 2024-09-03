class Car {
    
    String model;
    static int numberOfCars = 0;

    Car(String model) {
        this.model = model;
        numberOfCars++; 
    }

   
    void displayCarDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Total Number of Cars: " + numberOfCars);
    }
}



