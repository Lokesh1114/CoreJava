package Themes;
class Bank{
	void form() {
		System.out.println("Name______ Age_________");
	}
	void proofs(String id,String Adress) {
		System.out.println("id= "+id+" Adress="+Adress);
	}
	void proofs(int id,int Adress) {
		System.out.println("voter id= "+id+" adhar.no="+Adress);
	}
	String passBook() {
		return "passbook";
	}
	String deposit(int amount) {
		System.out.println("amount given "+amount);
		return "Deposited";
	}
}
public class Customer {

	public static void main(String[] args) {
		Bank icic=new Bank();
		icic.form();
		icic.proofs("pan:LKS6223D", "ration:AS123452213");
		icic.proofs(123245, 456784232);
		System.out.println("Back is given the "+icic.passBook());
		System.out.println("amount "+icic.deposit(500000));
	}

}
