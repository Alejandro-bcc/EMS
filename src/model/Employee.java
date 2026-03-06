package src.model;

import java.time.LocalDate;

public abstract class Employee {
    // Attributes
    private int id;
    private String firstName, lastName,
            email, phone,
            department;
    private LocalDate hireDate;
    private double salary;

    // Default Constructor
    public Employee() {
        this.setId(0);
        this.setFirstName("");
        this.setLastName("");
        this.setEmail("");
        this.setPhone("");
        this.setDepartment("");
        this.setHireDate(null);
        this.setSalary(0);
    }

    // Full Constructor
    public Employee(int id, String firstName, String lastName,
            String email, String phone, String department,
            LocalDate hireDate, double salary) {
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
        this.setPhone(phone);
        this.setDepartment(department);
        this.setHireDate(hireDate);
        this.setSalary(salary);
    }

    // Getters
    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getDepartment() {
        return this.department;
    }

    public LocalDate getHireDate() {
        return this.hireDate;
    }

    public double getSalary() {
        return this.salary;
    }

    // Setters
    public void setId(int id) {
        if (id >= 0) {
            this.id = id;
        }
    }

    public void setFirstName(String firstName) {
        if (firstName != null) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (lastName != null) {
            this.lastName = lastName;
        }
    }

    public void setEmail(String email) {
        if (email != null) {
            this.email = email;
        }
    }

    public void setPhone(String phone) {
        if (phone != null) {
            this.phone = phone;
        }
    }

    public void setDepartment(String department) {
        if (department != null) {
            this.department = department;
        }
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    // Methods
    @Override
    public String toString() {
        return String.format(
                "id: %d, first name: %s, last name: %s, email: %s, phone: %s, department: %s, hire date: %s, salary: %.2f",
                this.getId(), this.getFirstName(), this.getLastName(), this.getEmail(), this.getPhone(),
                this.getDepartment(), String.valueOf(this.getHireDate()), this.getSalary());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Employee))
            return false;
        return this.id == ((Employee) o).id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(this.id);
    }

    public String getFullName() {
        return String.format("%s %s", this.getFirstName(), this.getLastName());
    }

    public abstract String getRole();

    public abstract int getVacationDays();
}