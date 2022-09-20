package Themes;
class AutoMobile{
	void cost() {
		System.out.println("No Cost");
	}
	void milage() {
		System.out.println("No Milage");
	}
}
class Benze extends AutoMobile{
	void cost() {
		System.out.println("Benz cost Rs.41.99 Lakhs");
	}
	void milage() {
		System.out.println("Benz Milage 7KMPL");
	}
}
class RollRoyce extends AutoMobile{
	void cost() {
		System.out.println("RollRoyce cost Rs.8.02 Crores");
	}
	void milage() {
		System.out.println("RollRoyce Milage 9.8 Kmpl");
	}
}
public class MethodOverriding {
	public static void main(String[] args) {
		AutoMobile c=new AutoMobile();
		System.out.println("__Generally Car Had:__");
		c.cost();
		c.milage();
		System.out.println("__But Brand Mercidus Benze__");
		c=new Benze();
		c.cost();
		c.milage();
		System.out.println("__And Brand RollRoyce(RR)__");
		c=new RollRoyce();
		c.cost();
		c.milage();
	}

}
