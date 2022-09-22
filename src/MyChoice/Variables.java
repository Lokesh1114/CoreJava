package MyChoice;
class user{
	static String platform;
	String Email;
	int age;
	String search;}
class ChromeInterface{
	long NoOfResults;
	String WebSite;
	float SearchTime;
} 
public class Variables {
	public static void main(String[] args) {
		System.out.println("_________UserEntries__________");
		user u=new user();
		user.platform="GoogleChrome";
		u.Email="lokeshlucky841@gmail.com";
		u.age=22;
		u.search="CoreJava";
		System.out.println("Search Engine: "+user.platform);
		System.out.println("User Email: "+u.Email);
		System.out.println("User age: "+u.age);
		System.out.println("User search "+u.search);
		System.out.println();
		System.out.println("_________SearchResults__________");
		ChromeInterface c=new ChromeInterface();
		c.NoOfResults=437000000;
		c.WebSite="https://www.javatpoint.com";
		c.SearchTime=0.54f;
		System.out.println("Search Engine: "+user.platform);
		System.out.println("About "+c.NoOfResults+" results in "+c.SearchTime+" Seconds");
		System.out.println("Adress of First Website: "+c.WebSite);
		
	}

}
