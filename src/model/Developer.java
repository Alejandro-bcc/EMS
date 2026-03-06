package src.model;

import java.time.LocalDate;

public class Developer extends Employee {
    // Default Constructor
    public Developer() {
        super();
    }

    // Full Constructor
    public Developer(int id, String firstName, String lastName,
            String email, String phone, String department,
            LocalDate hireDate, double salary) {
        super(id, firstName, lastName, email, phone, department, hireDate, salary);
    }

    // Methods
    @Override
    public String getRole() {
        return "Developer";
    }

    @Override
    public int getVacationDays() {
        return 15;
    }
}
