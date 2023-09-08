class Seltos {
    private int speed = 100; // Private member variable 'speed' with an initial value of 100

    public int getSpeed() { // Public method to access 'speed'
        return speed;
    }

    private void setSpeed(int speed) { // Private method to set 'speed'
        this.speed = speed;
    }
}

public class Abstraction {
    int noCar; // Integer variable 'noCar' (not initialized)
    String Model = "Royal enfield"; // String variable 'Model' initialized with "Royal enfield"
    String engine = "3L diesel"; // String variable 'engine' initialized with "3L diesel"

    public static void main(String[] args) {
        Seltos obj = new Seltos(); // Create an instance of the 'Seltos' class
        int speed = obj.getSpeed(); // Call the 'getSpeed' method to retrieve the 'speed' value and store it in the 'speed' variable
        System.out.println("Seltos speed: " + speed); // Print the value of 'speed' to the console with a message
    }
}
