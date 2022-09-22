package MyChoice;
import java.util.Scanner;
abstract class Restaurent{
	abstract void placeOrder(String Order);
	abstract void  placeOrder(String Order1,String Order2);
	void welcome() {
		System.out.println("WelCome Sir...Your Order Please:");}
	String bill(int amount) {
		System.out.println("Bill:");
		System.out.println("Amount:"+amount);
		return "paid";}
	void bye() {
		System.out.println("Thanks For Visiting");}}
class Almas extends Restaurent{
	void placeOrder(String Order) {
		System.out.println(" Your Starters: "+Order);}
	void placeOrder(String Order1, String Order2) {
		System.out.println(" Your Order: "+Order1+" And "+Order2);}
}
class Paradise extends Restaurent{
	void placeOrder(String Order) {
		System.out.println(" Your Starters: "+Order);
		}
	void placeOrder(String Order1, String Order2) {
		System.out.println(" Your Orders: "+Order1+" And "+Order2);}
}
public class AbstractionOverLoading {
	public static void main(String arg[]) {
	Scanner s=new Scanner(System.in);
	Restaurent r;
	r=new Almas();
	r.welcome();
	r.placeOrder(s.next());
	r.placeOrder(s.next(), s.next());
	r.bill(s.nextInt());
	r.bye();
	r=new Paradise();
	r.welcome();
	r.placeOrder(s.next());
	r.placeOrder(s.next(), s.next());
	r.bill(s.nextInt());
	r.bye();
}
}
