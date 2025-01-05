package inheritance;

public class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void work() {
    	
    	super.work();
        System.out.println(name + " is coding in " + programmingLanguage + ".");
    }

    @Override
    double calculateBonus() {
        return salary * 0.15;
    }
}
