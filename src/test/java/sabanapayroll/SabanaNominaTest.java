package sabanapayroll;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SabanaNominaTest {

    private static List<Employee> employees;
    private static List<Department> departments;
    private static Department department;
    private static Department department2;
    private static Department department3;

    private static SabanaPayroll sabanaPayroll;

    private static EmployeeBySalary employeeBySalary;
    private static EmployeeBySalary employeeBySalary2;
    private static EmployeeBySalary employeeBySalary3;

    private static EmployeeByHours employeeByHours;
    private static EmployeeByHours employeeByHours2;
    private static EmployeeByHours employeeByHours3;

    private static EmployeeByCommission employeeByCommission;
    private static EmployeeByCommission employeeByCommission2;
    private static EmployeeByCommission employeeByCommission3;


    @BeforeAll
    public static void setUp(){

        department = new Department("Engineering");
        department2 = new Department("Finances");
        department3 = new Department("Sales");

        employeeBySalary = new EmployeeBySalary("Juan", "Perez", department, 1200000);
        employeeByHours = new EmployeeByHours("Camila", "Ramirez", department, 160);
        employeeByCommission = new EmployeeByCommission("Sergio", "Torres", department, 80);

        employeeBySalary2 = new EmployeeBySalary("Pepe", "Giraldo", department2, 1255000);
        employeeByHours2 = new EmployeeByHours("Mapa", "Mayorga", department2, 180);
        employeeByCommission2 = new EmployeeByCommission("Sergio", "Acero", department2, 90);

        employeeBySalary3 = new EmployeeBySalary("Carlos", "Pineda", department3, 1355000);
        employeeByHours3 = new EmployeeByHours("Tatiana", "Ruiz", department3, 200);
        employeeByCommission3 = new EmployeeByCommission("Tomas", "Garcia", department3, 150);


        employees = new ArrayList<>();
        employees.add(employeeBySalary);
        employees.add(employeeByHours);
        employees.add(employeeByCommission);

        departments = new ArrayList<>();
        departments.add(department2);
        departments.add(department3);
        departments.add(department);


    }

    @Test
    @DisplayName("GIVEN a salaried emloyeed WHEN calculate salary THEN get right salary")
    public void shouldCalculateSalaryBySalary(){
        assertEquals(1104000, employeeBySalary.calculateSalary());
    }

    @Test
    @DisplayName("GIVEN a employee working by hours WHEN calculate salary THEN get right salary")
    public void shouldCalculateSalaryByHours(){
        assertEquals(1040000, employeeByHours.calculateSalary());
    }

    @Test
    @DisplayName("GIVEN a employee working by commission WHEN calculate salary THEN get right salary")
    public void shouldCalculateSalaryByCommission(){
        assertEquals(1200000, employeeByCommission.calculateSalary());
    }

    @Test

    public void shouldCalculateDepartmentSalaries(){
        assertEquals(3344000, department.calculateDepartmentSalaries());
    }

    @Test

    public void shouldCalculateUniversitySalaries(){
        for(Department d: departments){
            double engineeringDepartmentSalaries =0;
            double salesDepartmentSalaries =0;
            double financesDepartmentSalaries =0;
            double totalUniversitiesSalaries=0;
            engineeringDepartmentSalaries= department.calculateDepartmentSalaries();
            salesDepartmentSalaries = department.calculateDepartmentSalaries();
            financesDepartmentSalaries = department.calculateDepartmentSalaries();

            totalUniversitiesSalaries = engineeringDepartmentSalaries+financesDepartmentSalaries+salesDepartmentSalaries;

        }

        assertEquals(3344000, department.calculateDepartmentSalaries());

    }
    @Test
    @DisplayName("GIVEN a employees WHEN toString THEN get right print format")
    public void shouldPrintEmployees(){
        sabanaPayroll.printPayroll();

        /*for(Employee e: employees){
            String printValue = e.toString();
            assertTrue(printValue.contains(e.getName()));
            assertTrue(printValue.contains(e.getLastName()));
            assertTrue(printValue.contains(department.getName()));
            assertTrue(printValue.contains(Integer.toString((int) e.calculateSalary())));

            if (e instanceof EmployeeBySalary)
                assertTrue(printValue.contains("payment by salary."));
            if (e instanceof EmployeeByHours)
                assertTrue(printValue.contains("payment by hours."));
            if (e instanceof EmployeeByCommission)
                assertTrue(printValue.contains("payment by comission."));
*/


    }
}