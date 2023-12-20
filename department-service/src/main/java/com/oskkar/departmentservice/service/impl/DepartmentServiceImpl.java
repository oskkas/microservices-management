package com.oskkar.departmentservice.service.impl;

import com.oskkar.departmentservice.dto.DepartmentDto;
import com.oskkar.departmentservice.entity.Department;
import com.oskkar.departmentservice.repository.DepartmentRepository;
import com.oskkar.departmentservice.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class DepartmentServiceImpl implements DepartmentService {

    DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto saveDepartmentDto(DepartmentDto departmentDto) {
        Department department = new Department(
                departmentDto.getId(),
                departmentDto.getName(),
                departmentDto.getDescription(),
                departmentDto.getCode()
        );
        Department savedDepartment = departmentRepository.save(department);

        return new DepartmentDto(
                savedDepartment.getId(),
                savedDepartment.getName(),
                savedDepartment.getDescription(),
                savedDepartment.getCode()
        );
    }

    @Override
    public DepartmentDto getDepartmentByCode(String code) {
        Department department = departmentRepository.findByCode(code).get();
        return new DepartmentDto(
                department.getId(),
                department.getName(),
                department.getDescription(),
                department.getCode()
        );
    }
}
