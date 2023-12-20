package com.oskkar.employeeservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class APIRestDto {
    EmployeeDto employeeDto;
    DepartmentDto departmentDto;
}
