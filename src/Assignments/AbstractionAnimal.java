package Assignments;
abstract class Animal{
	abstract void lifeSpan();
	abstract void color();
	void breath() {
		System.out.println("It Breathes Oxygen");
	}
}
class Liger extends Animal{
	void lifeSpan() {
		System.out.println("Liger Life Span 18 years");	
	}
	void color() {
		System.out.println("Liger color is Sandy or Dark yellow fur");
	}
	
}
class Cheetah extends Animal{
	void lifeSpan() {
		System.out.println("Liger Life Span 10 years");	
	}
	void color() {
		System.out.println("Cheetahs have an upper coat of fur that is tawny,\n pale buff or grayish white,\n with underparts that are\n paler and whiter");
	}
	
}
public class AbstractionAnimal {
	public static void main(String[] args) {
		Animal a;
		a=new Liger();
		a.lifeSpan();
		a.color();
		a.breath();
		a=new Cheetah();
		a.lifeSpan();
		a.color();
		a.breath();

	}

}
