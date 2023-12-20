package com.oskkar.employeeservice.service;

import com.oskkar.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);
    EmployeeDto findById(Integer id);
}
