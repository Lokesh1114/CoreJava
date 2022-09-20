package Themes;
import java.util.Scanner;
class Employe{
	int eid;
	double salary;
	static String company;
	Employe(int eid,double salary){
		this("Infosys");
		this.eid=eid;
		this.salary=salary;
		this.show();
	}
	Employe(String company) {
		Employe.company=company;
	}
	void show() {
		System.out.println("Id= "+eid);
		System.out.println("salary= "+salary);
		System.out.println("company= "+company);
		
	}
}
public class ConstructorDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee id, salary");
	Employe e1=new Employe(sc.nextInt(),sc.nextDouble());
	Employe  e2=new Employe(sc.next());
	e1.show();
	}

}
