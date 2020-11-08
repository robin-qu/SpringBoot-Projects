package com.robin.springboot06datamybatis.controller;

import com.robin.springboot06datamybatis.bean.Department;
import com.robin.springboot06datamybatis.bean.Employee;
import com.robin.springboot06datamybatis.mapper.DepartmentMapper;
import com.robin.springboot06datamybatis.mapper.EmployeeMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentMapper departmentMapper;

    @Autowired
    private EmployeeMapper employeeMapper;

    @GetMapping("/department/{id}")
    public Department getDepartment(@PathVariable("id") Integer id) {
        return departmentMapper.getDepartmentById(id);
    }

    @GetMapping("/department")
    public Department insertDepartment(Department department) {
        departmentMapper.insertDepartment(department);
        return department;
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable("id") Integer id) {
        return employeeMapper.getEmployee(id);
    }

    @GetMapping("/employee")
    public Employee insertEmployee(Employee employee) {
        employeeMapper.insertEmployee(employee);
        return employee;
    }
}
