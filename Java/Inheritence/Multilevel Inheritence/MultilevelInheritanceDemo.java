// Parent class
class Grandparent {
    void displayGrandparent() {
        System.out.println("This is the Grandparent class.");
    }
}

// Child class inheriting from Grandparent
class Parent extends Grandparent {
    void displayParent() {
        System.out.println("This is the Parent class.");
    }
}

// Child class inheriting from Parent
class Child extends Parent {
    void displayChild() {
        System.out.println("This is the Child class.");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        // Create an object of the Child class
        Child child = new Child();
        
        // Call methods from each level of inheritance
        child.displayGrandparent(); // Access method from Grandparent
        child.displayParent();      // Access method from Parent
        child.displayChild();       // Access method from Child
    }
}
