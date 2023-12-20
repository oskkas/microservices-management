package com.oskkar.departmentservice.service.impl;

import com.oskkar.departmentservice.dto.DepartmentDto;
import com.oskkar.departmentservice.entity.Department;
import com.oskkar.departmentservice.mapper.DepartmentMapper;
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
        Department department = DepartmentMapper.MAPPER.toDepartment(departmentDto);
        Department savedDepartment = departmentRepository.save(department);
        return DepartmentMapper.MAPPER.toDepartmentDto(savedDepartment);
    }

    @Override
    public DepartmentDto getDepartmentByCode(String code) {
        Department department = departmentRepository.findByCode(code).get();
        return DepartmentMapper.MAPPER.toDepartmentDto(department);
    }
}
