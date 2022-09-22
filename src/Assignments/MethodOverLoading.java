package Assignments;
import java.util.Scanner;
class Sum{
	void add(int x,int y) {
		System.out.println("Inter Additon:"+(x+y));
	}
	void add(float a, float b) {
		System.out.println("Decimal Addition: "+(a+b));
	}
	void add(int x,float y) {
		float c= x+y;
		System.out.println("Addition: "+c);
	}
	void add(int x,int y, int z) {
		System.out.println("3 numbers Addition:"+(x+y+z));
	}
}
public class MethodOverLoading {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	Sum s=new Sum();
	System.out.println("Enter Two Numbers:");
     s.add(input.nextInt(), input.nextInt());
     System.out.println("Enter Two Decimal Numbers:");
     s.add(input.nextFloat(), input.nextFloat());
     System.out.println("Enter Numbers:");
     s.add(input.nextInt(), input.nextFloat());
     System.out.println("Enter Three Numbers:");
     s.add(input.nextInt(), input.nextInt(),input.nextInt());
	}

}
