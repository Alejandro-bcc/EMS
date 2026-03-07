package src.repository;

import src.model.Employee;
import java.util.ArrayList;

public class EmployeeRepository {
    // Attributes
    private static EmployeeRepository instance;
    private ArrayList<Employee> employees;
    private int nextId = 1;

    // Constructor
    private EmployeeRepository() {
        this.employees = new ArrayList<Employee>();
    }

    // Methods
    public static EmployeeRepository getInstance() {
        if (instance == null) {
            instance = new EmployeeRepository();
        }
        return instance;
    }

    public ArrayList<Employee> getEmployees() {
        return this.employees;
    }

    public int generateId() {
        return this.nextId++;
    }
}
