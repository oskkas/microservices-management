package com.oskkar.employeeservice.service;

import com.oskkar.employeeservice.dto.APIRestDto;
import com.oskkar.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);
    APIRestDto findById(Integer id);
}
