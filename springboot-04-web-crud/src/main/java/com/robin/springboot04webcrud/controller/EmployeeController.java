package com.robin.springboot04webcrud.controller;

import com.robin.springboot04webcrud.dao.EmployeeDao;
import com.robin.springboot04webcrud.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping("/emps")
    public String list(Model model) {
        Collection<Employee> employees = employeeDao.getAll();
        model.addAttribute("emps", employees);

        return "emp/list";
    }
}
