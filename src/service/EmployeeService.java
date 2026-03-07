package src.service;

import src.dao.EmployeeDAO;
import src.model.Employee;
import java.util.ArrayList;

public class EmployeeService implements IEmployeeService {
    // Attribute
    private EmployeeDAO dao;

    // Constructor
    public EmployeeService() {
        this.dao = new EmployeeDAO();
    }

    // Methods
    public boolean add(Employee e) {
        if (this.dao.existsById(e.getId())) {
            return false;
        }
        this.dao.add(e);
        return true;
    }

    public boolean remove(int id) {
        if (!this.dao.existsById(id)) {
            return false;
        }
        return this.dao.remove(id);
    }

    public Employee findById(int id) {
        return this.dao.findById(id);
    }

    public ArrayList<Employee> findByName(String query) {
        return this.dao.findByName(query);
    }

    public ArrayList<Employee> findByDepartment(String department) {
        return this.dao.findByDepartment(department);
    }

    public ArrayList<Employee> findByRole(String role) {
        return this.dao.findByRole(role);
    }

    public ArrayList<Employee> findAll() {
        return this.dao.findAll();
    }

    public boolean update(Employee updated) {
        if (!this.dao.existsById(updated.getId())) {
            return false;
        }
        return this.dao.update(updated);
    }
}
