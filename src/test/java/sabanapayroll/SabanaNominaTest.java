package sabanapayroll;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SabanaNominaTest {

    private static List<Employee> employees;
    private static Department department;

    private static EmployeeBySalary employeeBySalary;
    private static EmployeeByHours employeeByHours;
    private static EmployeeByCommission employeeByCommission;

    @BeforeAll
    public static void setUp(){

        department = new Department("Engineering");

        employeeBySalary = new EmployeeBySalary("Juan", "Perez", department, 1200000);
        employeeByHours = new EmployeeByHours("Camila", "", department, 160);
        employeeByCommission = new EmployeeByCommission("Sergio", "Torres", department, 80);

        employees = new ArrayList<>();
        employees.add(employeeBySalary);
        employees.add(employeeByHours);
        employees.add(employeeByCommission);

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
    @DisplayName("GIVEN a employees WHEN toString THEN get right print format")
    public void shouldPrintEmployees(){

        for(Employee e: employees){
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

        }
    }
}