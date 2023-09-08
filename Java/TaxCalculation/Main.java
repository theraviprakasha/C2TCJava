public class Main {
    public static void main(String[] args) {
        TaxCalculation calculator = new TaxCalculation();

        // Create a Person object and set their attributes
        Person person1 = new Person();
        person1.setName("Alice");
        person1.setGender("Female");
        person1.setAge(30);
        person1.setIncome(200000);

        // Calculate tax for person1
        calculator.calculateTax(person1);

        // Print the results
        System.out.println("Name: " + person1.getName());
        System.out.println("Income: $" + person1.getIncome());
        System.out.println("Tax: $" + person1.getTax());
    }
}
