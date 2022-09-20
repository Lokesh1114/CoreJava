package Themes;
import java.util.*;
class Square{
	int a;
	Scanner sc=new Scanner(System.in);
	void input() {
		System.out.println("Enter a value");
		a=sc.nextInt();
	}
	void area() {
		System.out.println("Area: "+(a*a));
	}
}
class Add extends Square{
	int b;
	void accept() {
		System.out.println("Enter b value:");
		 b=sc.nextInt();
	}
	void sum() {
		System.out.println("Addition: "+(a+b));
	}
}
public class Inheritance {
 public static void main(String argg[]) {
	 Add s=new Add();
	 s.input();
	 s.area();
	 s.accept();
	 s.input();
	 s.sum();
 }
}
