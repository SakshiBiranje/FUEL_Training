package calculation.area;
import java.util.*;
public class AreaCalculator {

	public double Area(int s) {
		return s*s;
	}
	public double Area(int l,int b) {
		return l*b;
	}
	public double Area(float r) {
		return 3.14*r*r;
	}
	public double Area(float base , float height) {
		return 0.5*base * height;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius: ");
		int r =sc.nextInt();
		System.out.println("Enter length and breadth : ");
		int l = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter side :");
		float s= sc.nextInt();
		System.out.println("Enter base & height:  ");
		float base= sc.nextInt();
		float height= sc.nextInt();
		AreaCalculator a= new AreaCalculator();
		System.out.println("Area of  circle: "+ a.Area(r));
		System.out.println("Area of rectangle: "+ a.Area(l,b));
		System.out.println("Area of square :"+ a.Area(s));
		System.out.println("Area of triangle :"+ a.Area(base,height));
		
	}

}
