class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class DynamicBindingExample {
    public static void main(String[] args) {
        Animal myAnimal;

        myAnimal = new Dog(); // Creating a Dog object
        myAnimal.makeSound(); // Calls Dog's makeSound() method at runtime

        myAnimal = new Cat(); // Creating a Cat object
        myAnimal.makeSound(); // Calls Cat's makeSound() method at runtime
    }
}
