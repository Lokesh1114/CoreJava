package surendra_Themes;

import java.util.Scanner;

class Calculation{
	void sum(int x, float y) {
		System.out.println("value of the sum ="+(x+y));
	}
	void sum(float y, int x) {
		System.out.println("Value of the sum ="+(x+y));
	}
}
public class Method_Overloading_one {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculation obj = new Calculation();
		System.out.println("Enter the first values");
		int a=sc.nextInt();
		float b=sc.nextFloat();
		obj.sum(a, b);
		System.out.println(" ");
		System.out.println("Enter the Second values");
		float c=sc.nextFloat();
		int d=sc.nextInt();
		obj.sum(c, d);

	}
}
