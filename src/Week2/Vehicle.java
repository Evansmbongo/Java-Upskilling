package Week2;

public abstract class Vehicle {
    String make;
    String model;
    int year;

    public abstract void accelerate();
}
class Car extends Vehicle{
    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    @Override
    public void accelerate(){
        System.out.println("Vrooooooooooooom!!");
    }
    public void printDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
    public static void main(String[] args){
        Car car = new Car("Benz","S Class", 1730);
        car.printDetails();
        car.accelerate();
    }
}

class Bike extends Vehicle{
    public Bike(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    @Override
    public void accelerate(){
        System.out.println("Grrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr!!!!");
    }
    public void printDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
    public static void main(String[] args){
        Bike bike = new Bike("BMX","One Tire", 1730);
        bike.printDetails();
        bike.accelerate();
    }
}


