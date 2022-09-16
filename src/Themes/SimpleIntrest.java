package Themes;

public class SimpleIntrest {
	public static void main(String[] args) {
		int principle=1000;
		int time=1;
		int rate=5;
		System.out.println("Principle Amount is "+principle+" rs");
		System.out.println("Duration of principle Given "+time+" years");
		System.out.println("Rate of Intrest "+rate+"%");
		int si=(principle*time*rate)/100;
		System.out.println();
		System.out.println("Simple intrest by 1000rs in 1 year time with 13% intrest:");
		System.out.println(si);

	}

}
