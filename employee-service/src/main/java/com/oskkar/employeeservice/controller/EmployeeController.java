package com.oskkar.employeeservice.controller;

import com.oskkar.employeeservice.dto.EmployeeDto;
import com.oskkar.employeeservice.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto) {
        EmployeeDto savedEmployee = employeeService.saveEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> findEmployeeById(@PathVariable Integer id) {
        EmployeeDto employee = employeeService.findById(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }
}
