package sabanapayroll;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SabanaPayroll {

    private List<Employee> employees;
    private List<Department> departments;

    public SabanaPayroll() {
        this.departments = new ArrayList<>();
        this.employees = new ArrayList<>();
    }



    public double calculateUniversitySalary(){
        double departmentSalary=0;
        double totalSalary=0;

        for(Department d: departments){
            departmentSalary = d.calculateDepartmentSalaries();
            totalSalary = departmentSalary;

        }

        return totalSalary;
    }



    public void printPayroll(){
        for (Department d:departments){

        }
        System.out.println("");
    }

}
