package TopicBased;
abstract class Car{
	int cost;
	int wheels;
	float milage;
	int lights;
	Car(){
		this(4,2);
		this.start();
		System.out.println("Car Constructor");
	}
	Car(int wheels,int lights){
		System.out.println("Wheels:"+wheels+" lights: "+lights);
	}
	abstract void cost(int cost);
	abstract void milage(float milage);
	void start() {
		System.out.println("Car Should Start With A Key");
	}
}
class Benze extends Car{
	void cost(int cost ) {
		System.out.println("Benz cost: Rs."+cost+" lks");
	}
	void milage(float milage) {
		System.out.println("Benz Milage "+milage+"KMPL");
	}
}
class RollRoyce extends Car{
	void cost(int cost) {
		System.out.println("RollRoyce cost Rs."+cost+" Crores");
	}
	void milage(float milage) {
		System.out.println("RollRoyce Milage "+milage+" Kmpl");
	}
}
public class Abstarction {
	public static void main(String[] args) {
		Car c;
		System.out.println("__Mercidus Benze__");
		c=new Benze();
		c.start();
		c.cost(50);
		c.milage(14.22f);
		System.out.println("__RollRoyce(RR)__");
		c=new RollRoyce();
		c.start();
		c.cost(45);
		c.milage(9.34f);
	}
}
