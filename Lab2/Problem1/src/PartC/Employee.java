package PartC;

import java.util.Objects;

public class Employee extends Person {
    private String employeeId;

    public Employee(String name, int age, String employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public boolean equals(Object employee) {
        if (this == employee) return true;
        if (!(employee instanceof Employee)) return false;
        if (!super.equals(employee)) return false;
        Employee employee1 = (Employee) employee;
        return Objects.equals(employeeId, employee1.employeeId);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), employeeId);
    }

    public String toString() {
        return super.toString()
                + "Employee{"
                + "employeeId=" + employeeId + '}';
    }
}
