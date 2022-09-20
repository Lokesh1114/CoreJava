package Themes;
import java.util.*;
class Online{
	String name;
	int AccNo;
	int Password;
	int balance;
	Scanner sc=new Scanner(System.in);
	void details() {
		System.out.println("Enter Details Name/Account No/Password");
	}
	void balance() {
		System.out.println("Balance:");
		balance=sc.nextInt();
	}
}
class Phonepay extends Online{
	void details() {
		System.out.println("Details for PhonePay:");
		name=sc.next();
		AccNo=sc.nextInt();
		Password=sc.nextInt();
		System.out.println("Name: "+name+"\nAccount: "+AccNo+"\nPassword: "+Password);
	}
	void balance() {
		System.out.println("Balance:"+super.balance);
	}
	
}
class GPay extends Online{
	void details() {
		System.out.println("Details for Gpay:");
		name=sc.next();
		AccNo=sc.nextInt();
		Password=sc.nextInt();
		System.out.println("Name: "+name+"\nAccount: "+AccNo+"\nPassword: "+Password);
	}
	void balance() {
		System.out.println("Balance:"+super.balance);
	}
	
}
public class OnlineUser {
	public static void main(String arg[]) {
		Online ob=new Online();
		ob.details();
		ob.balance();
		ob=new Phonepay();
		ob.details();
		ob.balance();
		ob=new GPay();
		ob.details();
		ob.balance();
	}
}
