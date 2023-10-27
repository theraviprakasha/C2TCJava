
public class Encapsulation {
	
	// Data types and variables
	int i=10;
    int noCar;
    String Model="Royal enfield";
    String engine="3L disel";
    int speed=100;
    //set and get are the methods used set and get the values
    public int getSpeed() {
    	return speed;
    }
    public void setSpeed(int speed) {
    	//this keyword is used to refers to the current variable
    	this.speed=speed;
    }
    // Method
    void display1() {
    	for(i=0;i<=1;i++) {
    		System.out.println("This is KIA Motors, welcome to our showroom");
    	}
    	
    }
    void display2() {
    	for(i=0;i<=2;i++) {
    		System.out.println("This is KIA Motors, welcome to our showroom,which car you are looking for");
    	}
    	
    }


    // Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Creating an object to call the display method because static is not used
        Encapsulation object = new Encapsulation();
        object.display1();
        object.display2();
        object.setSpeed(100);
        System.out.println(object.getSpeed());
	}
}