public class Main {
    public static void main(String[] args) {
        // Create Person objects
        Person person1 = new Person();
        person1.setName("John");
        person1.setIncome(50000);

        Person person2 = new Person();
        person2.setName("Alice");
        person2.setIncome(75000);

        // Calculate and set tax for person1
        calculateTax(person1);

        // Calculate and set tax for person2
        calculateTax(person2);

        // Print the Person objects
        System.out.println(person1);
        System.out.println(person2);
    }

    // Function to calculate tax
    private static void calculateTax(Person person) {
        if (person.getIncome() <= 160000) {
            person.setTax(0);
        } else if (person.getIncome() <= 500000) {
            person.setTax((person.getIncome() - 160000) * 0.10);
        } else {
            person.setTax((person.getIncome() - 500000) * 0.30 + 34000);
        }
    }
}
