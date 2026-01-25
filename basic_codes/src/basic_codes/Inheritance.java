package basic_codes;
import java.util.*;
 class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating");
    }
}
//child class
 class dog extends Animal {
	void bark() {
		System.out.println(name +" is barking !!");
	}
}
public class Inheritance {

	
	public static void main(String[] args) {
		dog d = new dog();
		d.name= "tommy";
		d.eat();
		d.bark();

	}

}
