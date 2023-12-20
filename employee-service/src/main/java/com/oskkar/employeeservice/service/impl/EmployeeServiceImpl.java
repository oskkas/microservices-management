package com.oskkar.employeeservice.service.impl;

import com.oskkar.employeeservice.dto.EmployeeDto;
import com.oskkar.employeeservice.entity.Employee;
import com.oskkar.employeeservice.repository.EmployeeRepository;
import com.oskkar.employeeservice.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
        Employee savedEmployee = employeeRepository.save(employee);

        return new EmployeeDto(
                savedEmployee.getId(),
                savedEmployee.getFirstName(),
                savedEmployee.getLastName(),
                savedEmployee.getEmail()
        );
    }

    @Override
    public EmployeeDto findById(Integer id) {
        Employee employee = employeeRepository.findById(id).get();
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }
}
