package surendra_Themes;

public class Linkdn {
	void login(String Name, String password){
        System.out.println("plase wait your linkdn page is opening");
    }
    String search(String profileName){
        return "matching profiles";
    }
    String search(String job,String internship){
        return "matching jobs";
    }
    public static void main(String arg[]){
        Linkdn linkdn = new Linkdn();
        linkdn.login("Surendra","Varma@123");
        System.out.println(linkdn.search("Dharamala vinay"));
        System.out.println(linkdn.search("java developer","java developer"));
    }

}
