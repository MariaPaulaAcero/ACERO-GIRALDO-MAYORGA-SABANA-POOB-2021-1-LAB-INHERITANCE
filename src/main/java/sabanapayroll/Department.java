package sabanapayroll;

import java.util.UUID;
import java.util.ArrayList;
import java.util.List;

public class Department {

    private UUID departmentId;
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.departmentId = UUID.randomUUID();
    }

    public Department(List<Employee> employees) {
        this.employees = employees;
    }

    public double calculateDepartmentSalaries(){
        double employeeSalaryBySalary=0;
        double employeeSalaryByHours=0;
        double employeeSalaryByCommission=0;
        double totalSalary=0;

        for(Employee e: employees){
            if(e instanceof EmployeeBySalary){
                employeeSalaryBySalary =e.calculateSalary();
            }
            if(e instanceof EmployeeByHours){
                employeeSalaryByHours =e.calculateSalary();
            }
            if (e instanceof EmployeeByCommission){
                employeeSalaryByCommission =e.calculateSalary();
            }

            totalSalary = employeeSalaryBySalary+employeeSalaryByHours+employeeSalaryByCommission;

        }

        return totalSalary;
    }

    public String getName(){
        return name;
    }

}