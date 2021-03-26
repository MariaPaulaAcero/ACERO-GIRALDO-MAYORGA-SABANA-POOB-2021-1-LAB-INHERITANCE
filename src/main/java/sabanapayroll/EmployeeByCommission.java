package sabanapayroll;

public class EmployeeByCommission extends Employee{

    private static final double COMMISSION = 15000;
    private int soldProducts;


    public EmployeeByCommission(String name, String lastName, Department department, int soldProducts) {
        super(name, lastName, department);
        this.soldProducts = soldProducts;
    }

    @Override
    public double calculateSalary(){
        double salary = EmployeeByCommission.COMMISSION * soldProducts;
        return salary;
    }

    @Override
    public String toString(){
        return super.toString() + " payment by commission.";
    }
}

