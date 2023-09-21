public class ConstructorOverloadingExample {
    private int value1;
    private int value2;

    // Constructor with no parameters
    public ConstructorOverloadingExample() {
        value1 = 0;
        value2 = 0;
    }

    // Constructor with one parameter
    public ConstructorOverloadingExample(int val1) {
        value1 = val1;
        value2 = 0;
    }

    // Constructor with two parameters
    public ConstructorOverloadingExample(int val1, int val2) {
        value1 = val1;
        value2 = val2;
    }

    public void displayValues() {
        System.out.println("Value1: " + value1);
        System.out.println("Value2: " + value2);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        ConstructorOverloadingExample obj1 = new ConstructorOverloadingExample();
        ConstructorOverloadingExample obj2 = new ConstructorOverloadingExample(5);
        ConstructorOverloadingExample obj3 = new ConstructorOverloadingExample(10, 20);

        // Displaying the values
        System.out.println("Object 1:");
        obj1.displayValues();

        System.out.println("Object 2:");
        obj2.displayValues();

        System.out.println("Object 3:");
        obj3.displayValues();
    }
}
