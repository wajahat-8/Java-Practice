package inheritance;

public class Manager extends Employee {
    int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    void work() {
    	
        super.work();
        System.out.println(name + " is managing a team of " + teamSize + " members.");
    }

    @Override
    double calculateBonus() {
        return salary * 0.2;
    }
}
