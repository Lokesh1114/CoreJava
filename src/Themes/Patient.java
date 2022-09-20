package Themes;
import java.util.Scanner;
class Fever{
	Scanner sc=new Scanner(System.in);
	String prob;
	int temp;
	Fever(){
		System.out.println("Enter Problem&&Temparature: ");
		prob=sc.nextLine();
		temp=sc.nextInt();
	}
	void problem() {
		System.out.println("Fever with "+prob);
	}
	void temparature() {
		System.out.println("Fever Temparature: "+temp);
	}
	String conform() {
		return "Paracetmol";
	}
}
class Cold extends Fever{
	void problem() {
		System.out.println("What is ur problem Agaain:"+prob);
	}
	void temparature() {
		System.out.println("U have temparature: "+temp);
	}
	String conform() {
		return "U have cold too go to corona test";
	}
}
class Corona extends Cold{
	void problem() {
		System.out.println("U have both fever and cold");
	}
	void temparature() {
		System.out.println("With temparature"+temp);
	}
	String conform() {
		return "Corona Positive";
	}
}
public class Patient {
	public static void main(String arg[]) {
		Fever Lokesh=new Fever();
		Lokesh.problem();
		Lokesh.temparature();
		System.out.println("Medicine:"+Lokesh.conform());
		Lokesh=new Cold();
		Lokesh.problem();
		Lokesh.temparature();
		System.out.println(""+Lokesh.conform());
		Lokesh=new Corona();
		Lokesh.problem();
		Lokesh.temparature();
		System.out.println(""+Lokesh.conform());
		
	}
}
