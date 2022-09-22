package Assignments;
import java.util.Scanner;
class Circle {
	float r;
	Scanner scs=new Scanner(System.in);
	void in() {
		System.out.println("Enter r value");
		r =scs.nextFloat();
	}
	void area() {
		System.out.println("Area: "+(3.14*r*r));
	}
}
class Cone extends Circle {
	float l;
	void take() {
		System.out.println("Enter l value");
		l=scs.nextFloat();
	}
	void sArea() {
		System.out.println("Surface Area: "+(3.14*r*l));
		}
	}
public class Inheritance1 {

	public static void main(String[] args) {
		Cone c= new Cone();
		c.in();
		c.area();
		c.take();
		c.sArea();
	}
}
