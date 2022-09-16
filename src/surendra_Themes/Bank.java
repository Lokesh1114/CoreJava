package surendra_Themes;

public class Bank {
	void form(){
        System.out.println("Details age__ name__");
    }
    void submitProof(String id, String adress){
        System.out.println("id="+id+" and adress="+adress);
    }
    String passbook(){
        return "passbook";
    }
    String deposit(int amount){
        System.out.println("Amount given "+amount);
        return "deposited";
    }
    public static void main(String[] args) {
    	Bank sbi =  new Bank();
        sbi.form();
        sbi.submitProof("1234","Adhar:12354678");
        System.out.println("Bank given "+sbi.passbook());
        System.out.println("Amount "+sbi.deposit(345));
    
    }
}


