package src.model;

import java.time.LocalDate;

public class Intern extends Employee {
    // Default Constructor
    public Intern() {
        super();
    }

    // Full Constructor
    public Intern(int id, String firstName, String lastName,
            String email, String phone, String department,
            LocalDate hireDate, double salary) {
        super(id, firstName, lastName, email, phone, department, hireDate, salary);
    }

    // Methods
    @Override
    public String getRole() {
        return "Intern";
    }

    @Override
    public int getVacationDays() {
        return 5;
    }
}
