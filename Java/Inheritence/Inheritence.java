class parent{
	void add(int x,int y) {
		System.out.println("Add from parent "+(x+y));//parent
	}
}

public class Inheritence extends parent
//overrides com.accenture.pgm.parent.add
{
	//super keyword is used to refer immediate parent class
	
	void add(int x,int y) {
		//super.add(2,2);
		System.out.println("Add from child "+(x+y));//child
	}

	public static void main(String[] args) {
		//creating object to give access
		Inheritence i = new Inheritence();
		i.add(2, 2);
	}

}
//Inheritance is the concept in java and it is object oriented  to create a new class by inheriting the properties of its parent class