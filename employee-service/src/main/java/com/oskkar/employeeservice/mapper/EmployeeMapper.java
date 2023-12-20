package com.oskkar.employeeservice.mapper;

import com.oskkar.employeeservice.dto.EmployeeDto;
import com.oskkar.employeeservice.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {
    EmployeeMapper MAPPER = Mappers.getMapper(EmployeeMapper.class);

    Employee toEmployee(EmployeeDto employeeDto);
    EmployeeDto toEmployeeDto(Employee employee);
}
