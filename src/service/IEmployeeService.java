package src.service;

import java.util.ArrayList;

import src.model.Employee;

public interface IEmployeeService {
    public abstract boolean add(Employee e);
    public abstract boolean remove(int id);
    public abstract Employee findById(int id);
    public abstract ArrayList<Employee> findByName(String query);
    public abstract ArrayList<Employee> findByDepartment(String department);
    public abstract ArrayList<Employee> findByRole(String role);
    public abstract ArrayList<Employee> findAll();
    public abstract boolean update(Employee updated);
}
