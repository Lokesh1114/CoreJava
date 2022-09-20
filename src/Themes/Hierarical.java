package Themes;
import java.util.Scanner;
class Car{
	int cost;
	String color;
	int milage;
	int seat;
	Scanner s=new Scanner(System.in);
	void fearuters() {
		System.out.println("Car feartures:");
		cost=s.nextInt();
		color=s.next();
		milage=s.nextInt();
		seat=s.nextInt();
	}
}
class Audi extends Car{
	void audiFeature() {
		System.out.println("Audi features");
		System.out.println("cost: "+cost+"lks\ncolor: "+color+"\nmilage: "+milage+"kmpl\nseating: "+seat);
	}
}
class Bmw extends Car{
	void bmwFeature() {
		System.out.println("BMW features");
		System.out.println("cost: "+cost+"lks\ncolor: "+color+"\nmilage: "+milage+"kmpl\nseating: "+seat);
	}
}
public class Hierarical {
	public static void main(String arg[]) {
		Audi a=new Audi();
		a.fearuters();
		a.audiFeature();
		Bmw b=new Bmw();
		b.fearuters();
		b.bmwFeature();
	}
}
