package src.model;

import java.time.LocalDate;

public class Manager extends Employee {
    // Default Constructor
    public Manager() {
        super();
    }

    // Full Constructor
    public Manager(int id, String firstName, String lastName,
            String email, String phone, String department,
            LocalDate hireDate, double salary) {
        super(id, firstName, lastName, email, phone, department, hireDate, salary);
    }

    // Methods
    @Override
    public String getRole() {
        return "Manager";
    }

    @Override
    public int getVacationDays() {
        return 20;
    }
}
