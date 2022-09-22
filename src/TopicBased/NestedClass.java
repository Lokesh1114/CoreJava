package TopicBased;
class University{
	void announcement() {
		System.out.println("Exams from 15th October");}
	static class jntu{
		static void syllabus() {
			System.out.println("Completed");}
		void prepare() {
			System.out.println("Question Paper Prepare in 10days");}
	}}
class ItCompany{
	Wipro w=new Wipro();
	void recursion() {
		System.out.println("All IT Companies start Recursion");
		w.employes(300);
		Wipro.dismiss((short) 150);}
	class Wipro{
		static int employe;
		void employes(int employe){
			Wipro.employe=employe;
			System.out.println("We have "+employe+" employes");}
		static void dismiss(short emp) {
			System.out.println("we dissmiss "+emp+" employes and\n now we have "+(employe-emp));}
	}}
class Hospital{
	void departments() {
		class Cardiology{
			void details() {
				System.out.println("Only related with heart related problems");}
			static void surgens() {
				System.out.println("Only related with operators");}
			}
		Cardiology c=new Cardiology();
		c.details();
		Cardiology.surgens();
	}}
public class NestedClass {
	public static void main(String arg[]) {
		University u=new University();
		u.announcement();
		University.jntu.syllabus();
		University.jntu mech=new University.jntu();
		mech.prepare();
		System.out.println("_________________________________");
		Hospital h=new Hospital();
		h.departments();
		System.out.println("_________________________________");
		ItCompany i=new ItCompany();
		i.recursion();
	}
}
