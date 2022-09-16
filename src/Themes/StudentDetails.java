package Themes;
class Collage{
	String name;
	int id;
	float marks;
	static String collage;}
class Employee{
	String name;
	int Eid;
	float salary;}
public class StudentDetails {
	public static void main(String[] args) {
		System.out.println("________________Student Details________________________");
		Collage lokesh=new Collage();
		lokesh.name="Lokesh";
		lokesh.id=18306;
		lokesh.marks=82.34f;
		Collage.collage="Mother Teresa";
		System.out.println(" Student name= "+lokesh.name);
		System.out.println(" student id= "+lokesh.id);
		System.out.println(" Student marks= "+lokesh.marks);
		System.out.println("collage= "+Collage.collage);
		System.out.println();
		System.out.println("________________Employee Details________________________");
		Employee chinna=new Employee();
		chinna.name="Chinna";
		chinna.Eid=12234;
		chinna.salary=500034.42f;
		System.out.println("Employee Name: "+chinna.name);
		System.out.println("Employee id: "+chinna.Eid);
		System.out.println("Employee salary: "+chinna.salary);
		
	}

}
