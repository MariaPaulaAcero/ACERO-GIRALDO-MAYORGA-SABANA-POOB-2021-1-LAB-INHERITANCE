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

    public double calculateEmployeesSalary(UUID employeeId){
        return 0;
    }

    public double calculateDepartmentSalary(UUID departmentId){
        return 0;
    }

    public double calculateUniversitySalary(){
        return 0;
    }

    public void printPayroll(){
        return;
    }

}
