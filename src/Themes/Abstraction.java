package Themes;
import java.util.Scanner;
abstract class Details{
	String name;
	int AccNo;
	int Password;
	int balance;
	Details(){
		System.out.println("Welcome");
	}
	Scanner sc=new Scanner(System.in);
	abstract void details();
	abstract void balance(int balance); 
	abstract void send(float balance);
}
class AmazonPay extends Details{
	void details() {
		System.out.println("Details for AmazonPay:");
		name=sc.next();
		AccNo=sc.nextInt();
		Password=sc.nextInt();
		System.out.println("Name: "+name+"\nAccount: "+AccNo+"\nPassword: "+Password);
	}
	void balance(int balance) {
		System.out.println("Balance:"+balance);
	}
	void send(float amount) {
		System.out.println("You sent:"+amount+"\n remaing: "+(balance-amount));
		
	}
	
}
class PayPal extends Details{
	void details() {
		System.out.println("Details for PayPal:");
		name=sc.next();
		AccNo=sc.nextInt();
		Password=sc.nextInt();
		System.out.println("Name: "+name+"\nAccount: "+AccNo+"\nPassword: "+Password);
	}
	void balance(int balance) {
		System.out.println("Balance:"+super.balance);
	}
	void send(float amount) {
		System.out.println("You sent:"+amount+"\n remaing: "+(balance-amount));
	}
	
}

	
public class Abstraction {
	public static void main(String arg[]) {
		Details ob;
		ob=new AmazonPay();
		ob.details();
		ob.balance(10000);
		ob.send(980.22f);
		ob=new PayPal();
		ob.details();
		ob.balance(12000);
		ob.send(1000.45f);
	}
}
