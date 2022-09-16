package surendra_Themes;

class Lnkdn{
	void login(String Name, String password){
        System.out.println("plase wait your linkdn page is opening");
    }
	
    String search(String profileName){
        return "matching profiles";
    }
	
    String search(String job,String internship){
        return "matching jobs"; 
    }
}
public class Constructor extends Lnkdn{ 
	public static void main(String[] args) {
		Lnkdn l=new Lnkdn();
	}


}