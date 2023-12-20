package com.oskkar.employeeservice.service.impl;

import com.oskkar.employeeservice.dto.APIRestDto;
import com.oskkar.employeeservice.dto.DepartmentDto;
import com.oskkar.employeeservice.dto.EmployeeDto;
import com.oskkar.employeeservice.entity.Employee;
import com.oskkar.employeeservice.mapper.EmployeeMapper;
import com.oskkar.employeeservice.repository.EmployeeRepository;
import com.oskkar.employeeservice.service.APIClient;
import com.oskkar.employeeservice.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    private APIClient apiClient;

    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.MAPPER.toEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.MAPPER.toEmployeeDto(savedEmployee);
    }

    @Override
    public APIRestDto findById(Integer id) {
        Employee employee = employeeRepository.findById(id).get();
        EmployeeDto employeeDto = EmployeeMapper.MAPPER.toEmployeeDto(employee);
        DepartmentDto departmentDto = apiClient.findDepartmentByCode(employee.getDepartmentCode());

        APIRestDto apiRestDto = new APIRestDto();
        apiRestDto.setEmployeeDto(employeeDto);
        apiRestDto.setDepartmentDto(departmentDto);

        return apiRestDto;
    }
}
