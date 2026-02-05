package Overriding;

//Abstract class
abstract class Vehicle {
 // Abstract method
 abstract void run();
}

//Subclass Car
class Car extends Vehicle {
 @Override
 void run() {
     System.out.println("Car is running");
 }
}

//Subclass Bike
class Bike extends Vehicle {
 @Override
 void run() {
     System.out.println("Bike is running");
 }
}

//Main class
public class AbstractionDemo {
 public static void main(String[] args) {
     Vehicle v1 = new Car();
     Vehicle v2 = new Bike();
     
     v1.run();
     v2.run();
 }
}
