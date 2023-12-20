package com.oskkar.employeeservice.service.impl;

import com.oskkar.employeeservice.dto.EmployeeDto;
import com.oskkar.employeeservice.entity.Employee;
import com.oskkar.employeeservice.mapper.EmployeeMapper;
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
        Employee employee = EmployeeMapper.MAPPER.toEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.MAPPER.toEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto findById(Integer id) {
        Employee employee = employeeRepository.findById(id).get();
        return EmployeeMapper.MAPPER.toEmployeeDto(employee);
    }
}
