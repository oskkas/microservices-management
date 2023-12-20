package com.oskkar.departmentservice.controller;

import com.oskkar.departmentservice.dto.DepartmentDto;
import com.oskkar.departmentservice.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private DepartmentService departmentService;

    @PostMapping
    public ResponseEntity<DepartmentDto> saveDepartment(@RequestBody DepartmentDto departmentDto) {
        DepartmentDto savedDepartmentDto = departmentService.saveDepartmentDto(departmentDto);
        return new ResponseEntity<>(savedDepartmentDto, HttpStatus.CREATED);
    }

    @GetMapping("/{code}")
    public ResponseEntity<DepartmentDto> findDepartmentByCode(@PathVariable String code) {
        DepartmentDto departmentDto = departmentService.getDepartmentByCode(code);
        return new ResponseEntity<>(departmentDto, HttpStatus.OK);
    }

}
