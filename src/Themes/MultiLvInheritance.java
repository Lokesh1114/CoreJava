package Themes;
import java.util.Scanner;
class Fruits{
	String taste;
	String color;
	Scanner s=new Scanner(System.in);
	void input() {
		System.out.println("Enter taste & color:");
		taste=s.next();
		color=s.next();
	}
}
class Apple extends Fruits{
	void taste() {
		System.out.println("Apple is "+taste);
	}
	void color() {
		System.out.println("Apple is "+color);
	}
} 
class Health extends Apple{
	 void doctor() {
		 System.out.println("An Apple a day keep the doctor away");
	 }
}
class Medicine extends Health{
	String medicine;
	void fever() {
		System.out.println("Enter:");
		medicine=s.next();
		System.out.println("For fever:"+medicine);
	}
	void cold() {
		System.out.println("Enter:");
		medicine=s.next();
		System.out.println("For cold:"+medicine);
	}
}
public class MultiLvInheritance {
	public static void main(String[] args) {
		Medicine h=new Medicine();
		h.input();
		h.taste();
		h.color();
		h.doctor();
		h.fever();
		h.cold();
	}

}
