package Themes;
import java.util.*;
class  BitCoin{
	static String country;
	int rupee;
	float Etherum;
	Double Bitcoin;
	BitCoin(int rupee,float Etherum, double Bitcoin){
		this("India");
		this.rupee=rupee;
		this.Etherum=Etherum;
		this.Bitcoin=Bitcoin;}
	BitCoin(String Country){
		BitCoins.country=country;}
}
class RupeeToUSDs extends BitCoin{
	int cash;
	float USD;
	RupeeToUSDs(int cash){
		super(1,4211.42f,52341.523f);
		this.cash=cash;
		this.USD=(float) (74.39/this.cash);}
	void Display() {
		System.out.println("Country: "+BitCoin.country);
		System.out.println("Rupee: "+rupee+" rs");
		System.out.println("Etherum: "+Etherum+" rs");
		System.out.println("BitCoin: "+Bitcoin+" rs");
		System.out.println("cash: "+cash+" rs");
		System.out.println("Cash in USD: "+USD+" $");}
}
public class Constructor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values:");
		RupeeToUSDs r=new RupeeToUSDs(sc.nextInt());
		r.Display();
	}

}
