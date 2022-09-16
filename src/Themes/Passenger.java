package Themes;
import java.util.Scanner;
class Hyd_Metro{
	static String from;
	void from(String from) {
		Hyd_Metro.from=from;
	}
	void Destination() {
		System.out.println("From "+Hyd_Metro.from+" to 1.Ameerpet 2.Punjagutta 3.Khairathabad");
	}
	void Destination(String Destination) {
		System.out.println("Destion: "+Destination);
	}
	String selected() {
		return "Selected";
	}
	String charge(int amount) {
		return "Ticket";
	}
}
public class Passenger{
	public static void main(String ag[]) {
	Scanner sc=new Scanner(System.in);
	Hyd_Metro lokesh=new Hyd_Metro();
	System.out.println("From:");
	lokesh.from(sc.nextLine());
	lokesh.Destination();
	System.out.println("to:");
	lokesh.Destination(sc.next());
	System.out.println("Destination is "+lokesh.selected());
	System.out.println("1.Ameerpet-9rs\n2.Punjagutta-9rs\n3.Khairathabad-13rs");
	System.out.println("Amount: ");
	System.out.println("Amount: paid "+lokesh.charge(sc.nextInt())+" Recived");
}
}