package sabanapayroll;

import java.util.UUID;

public class Employee {

    private UUID employeeId;
    private String name;
    private String lastName;
    private Department department;

    public Employee(String name, String lastName, Department department) {
        this.employeeId = UUID.randomUUID();
        this.name = name;
        this.lastName = lastName;
        this.department = department;
    }

    public double calculateSalary(){
        return 0;
    }

    @Override
    public String toString(){
        return String.format("%s %s, department %s, salario %s,", this.name, this.lastName, this.department.getName(), this.calculateSalary());
    }

    public String getName(){
        return name;
    }

    public String getLastName(){
        return lastName;
    }
}
