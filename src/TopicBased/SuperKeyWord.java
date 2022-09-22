package TopicBased;
class Parent{
	Parent(int age){
		System.out.println("Parent age is "+age);
	}
}
class Child extends Parent{
	Child(int age){
		super(65);
		System.out.println("Child age is "+age);
	}
}
public class SuperKeyWord {
	public static void main(String arg[]) {
	Child c=new Child(22);
}
}