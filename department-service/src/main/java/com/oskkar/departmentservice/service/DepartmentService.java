package com.oskkar.departmentservice.service;

import com.oskkar.departmentservice.dto.DepartmentDto;

public interface DepartmentService {

    DepartmentDto saveDepartmentDto(DepartmentDto departmentDto);
    DepartmentDto getDepartmentByCode(String code);
}
