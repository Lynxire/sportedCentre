package by.teachmeskills.service;

import by.teachmeskills.entity.Employee;
import by.teachmeskills.repository.EmployeeRepositoryInterface;
import by.teachmeskills.repository.impl.EmployeeRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private EmployeeRepositoryInterface employeeRepositoryInterface;

    @Autowired
    public EmployeeService(EmployeeRepositoryInterface employeeRepositoryInterface) {
        this.employeeRepositoryInterface = employeeRepositoryInterface;
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
