package by.teachmeskills.service;

import by.teachmeskills.entity.Employee;
import by.teachmeskills.repository.EmployeeRepositoryInterface;
import by.teachmeskills.repository.impl.EmployeeRepositoryImpl;

public class EmployeeService {
    private EmployeeRepositoryInterface employeeRepositoryInterface;
    public EmployeeService(){
        employeeRepositoryInterface = new EmployeeRepositoryImpl();
    }
    public void add(Employee employee){
        employeeRepositoryInterface.add(employee);
    }
    public Employee findEmployeeWithMaxSalary(){
        Employee maxSalaryForEmployee = employeeRepositoryInterface.findEmployeeWithMaxSalary();
        return maxSalaryForEmployee;
    }
    public Employee findEmployeeWithMinSalary(){
        Employee employeeWithMinSalary = employeeRepositoryInterface.findEmployeeWithMinSalary();
        return employeeWithMinSalary;
    }
}
