package sabanapayroll;

import java.util.UUID;

public class Department {

    private UUID departmentId;
    private String name;

    public Department(String name) {
        this.name = name;
        this.departmentId = UUID.randomUUID();
    }

    public double calculateDepartmentSalaries(){
        return 0;
    }

    public String getName(){
        return name;
    }
}