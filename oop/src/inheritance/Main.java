package inheritance;

public class Main {
    public static void main(String[] args) {
        // Create instances
        Employee generalEmployee = new Employee("Alice", 101, 10000);
        Manager manager = new Manager("Bob", 102, 12000, 5);
        Developer developer = new Developer("Charlie", 103, 11000, "Java");

        // Polymorphism example
        Employee[] employees = {generalEmployee, manager, developer};
        for (Employee emp : employees) {
            emp.work();
            System.out.println("Bonus: $" + emp.calculateBonus());
            System.out.println();
        }
    }
}
