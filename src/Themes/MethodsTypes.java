package Themes;
import java.util.Scanner;
class Phonepee {
	void passWord(int password) {
		System.out.println("Your Password: "+password+" is correct");
		System.out.println();
	}
	String open() {
		return "Welcome Lokesh Siddula";
	}
	void Interface() {
		System.out.println("Select One");
		System.out.println("|Check Bank Balance|  |Mobile Recharge|   |Hyd Metro Tickets|");
		System.out.println();
	}
	void mobile_Recharge(long Number) {
		System.out.println("Mobile Number"+Number);
	}
	String mobile_Recharge(String sim,int Amount) {
		System.out.println("sim: "+sim);
		System.out.println("Package :"+Amount+"Unlimited calls 1.5gb & 56 days validity");
		System.out.println();
		return "***Recharge Successfull!****";
	}
}
public class MethodsTypes{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		Phonepee p=new Phonepee();
		System.out.println("Enter Password:");
		p.passWord(sc.nextInt());
		System.out.println(p.open());
		p.Interface();
		System.out.println("Enter Mobile Number: ");
		p.mobile_Recharge(sc.nextLong());
		System.out.println("Enter The Sim and Amount");
		System.out.println(p.mobile_Recharge(sc.next(), sc.nextInt()));
}
}