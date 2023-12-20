package com.oskkar.departmentservice.mapper;

import com.oskkar.departmentservice.dto.DepartmentDto;
import com.oskkar.departmentservice.entity.Department;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DepartmentMapper {
    DepartmentMapper MAPPER = Mappers.getMapper(DepartmentMapper.class);

    Department toDepartment(DepartmentDto departmentDto);
    DepartmentDto toDepartmentDto(Department department);
}
