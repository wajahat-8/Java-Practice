package inheritance;


public class Employee {
    String name;
    int id;
    double salary;
 public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
       void work() {
        System.out.println(name + " (Employee ID: " + id + ") is working.");
    }

    double calculateBonus() {
        return salary * 0.1;
    }
}

