package MyChoice;
class Collage1{
	String name;
	int id;
	int rollnumber;
	String Hobby;
	Collage1(String name,int id,int rollnumber,String Hobby){
		this.name=name;
		this.id=id;
		this.rollnumber=rollnumber;
		this.Hobby=Hobby;
		System.out.println("this is constructor");
	}
	Collage1(int a){
		System.out.println(a);
	}
}
class Register extends Collage1{
	Register(){
		super("Lokesh", 101, 90, "Dancing");
	}
	void show() {
		System.out.println("Iam "+name+" My ID "+id+" Rollno "+rollnumber+" and Hobby "+Hobby);
	}
}
public class Constructor {

	public static void main(String[] args) {
	     	Register obj=new Register();
			obj.show();
	}

}
