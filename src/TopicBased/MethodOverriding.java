package TopicBased;
class AutoMobile{
	void cost() {
		System.out.println("No Cost");
	}
	void milage() {
		System.out.println("No Milage");
	}
}
class Bmw extends AutoMobile{
	void cost() {
		System.out.println("Bmw cost Rs.41.99 Lakhs");
	}
	void milage() {
		System.out.println("Bmw Milage 7KMPL");
	}
}
class Audi extends AutoMobile{
	void cost() {
		System.out.println("Audi cost Rs.49 lks");
	}
	void milage() {
		System.out.println("Audi Milage 9.8 Kmpl");
	}
}
public class MethodOverriding {
	public static void main(String[] args) {
		AutoMobile c=new AutoMobile();
		System.out.println("__Generally Car Had:__");
		c.cost();
		c.milage();
		System.out.println("__But Brand BMW__");
		c=new Bmw();
		c.cost();
		c.milage();
		System.out.println("__And Brand Audi__");
		c=new Audi();
		c.cost();
		c.milage();
	}

}
