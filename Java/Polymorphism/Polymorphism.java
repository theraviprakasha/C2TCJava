public class Polymorphism {
	void setSpeed(int x) {
		
	}
	//method
	void add(int x,int y) {
		System.out.println("Add is "+(x+y));
	}
	void add(int x,int y,int z) {
		System.out.println("Add is "+(x+y+z));
	}
	void add(int x,int y,int z,int a) {
		System.out.println("Add is "+(x+y+z+a));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism p = new Polymorphism();
		p.add(2, 2);
		p.add(2, 2,3);
		p.add(2, 2,3,5);
	}

}
//two types 1.method overloading-same name different parameters   
//2.method overriding-same parameter same name