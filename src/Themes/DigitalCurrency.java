package Themes;
class  BitCoins{
	static String country;
	int rupee;
	float Etherum;
	Double Bitcoin;
}
class RupeeToUSD{
	String PaymentMethod;
	int cash;
	float USD;
}
public class DigitalCurrency {
	public static void main(String[] args) {
		System.out.println("___________________BitCoinsValues__________________________");
		BitCoins b=new BitCoins();
		BitCoins.country="INDIA";
		b.rupee=1;
		b.Etherum= 127997.03f;
		b.Bitcoin= 1611969.56d;
		System.out.println("Name of Country: "+BitCoins.country);
		System.out.println("MINCurrency in country: "+b.rupee+"rs");
		System.out.println("Etherum in rupees: "+b.Etherum+"rs");
		System.out.println("Bitcoin in rupees: "+b.Bitcoin+"rs");
		System.out.println();
		System.out.println("___________________RupeeToUSD__________________________");
		RupeeToUSD r=new RupeeToUSD();
		r.PaymentMethod="BankingCards";
		r.cash=234;
		r.USD=r.cash/79.46f;
		System.out.println("Name Of Country: "+BitCoins.country);
		System.out.println("Online Payment Method: "+r.PaymentMethod);
		System.out.println("The Cash in RS : "+r.cash);
		System.out.println("Rupess in USD : "+r.USD+"$");
	}

}
