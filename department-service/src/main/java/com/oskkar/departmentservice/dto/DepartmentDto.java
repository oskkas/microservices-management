package com.oskkar.departmentservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DepartmentDto {
    private Integer id;
    private String name;
    private String description;
    private String code;
}
