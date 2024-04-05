package by.teachmeskills.repository;

import by.teachmeskills.entity.Employee;

public interface EmployeeRepositoryInterface {
    public void add(Employee employee);
    public Employee findEmployeeWithMaxSalary();
    public Employee findEmployeeWithMinSalary();
}
