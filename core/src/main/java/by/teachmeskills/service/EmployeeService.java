package by.teachmeskills.service;

import by.teachmeskills.entity.Employee;
import by.teachmeskills.repository.EmployeeRepositoryInterface;
import by.teachmeskills.repository.impl.EmployeeRepositoryImpl;

public class EmployeeService {
    public void add(Employee employee){
        EmployeeRepositoryInterface employeeRepositoryInterface = new EmployeeRepositoryImpl();
        employeeRepositoryInterface.add(employee);
    }
}
