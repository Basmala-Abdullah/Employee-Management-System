package com.demo.springboot.employee_management.controller;

import com.demo.springboot.employee_management.entity.Employee;
import com.demo.springboot.employee_management.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;
    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService=employeeService;
    }

    //mapping for listing the employees
    @GetMapping("/list")
    public String listEmployees(Model theModel){
        List<Employee> allEmployees = employeeService.findAll();
        theModel.addAttribute("employees", allEmployees);

        return "employees/list-employees";
    }

    @GetMapping("/showFormAdd")
    public String showFormAdd(Model theModel){
        theModel.addAttribute("employee", new Employee());
        return "employees/employee-form";
    }

    @GetMapping("/showFormUpdate")
    public String showFormForUpdate(@RequestParam("employeeId") int theId,
                                    Model theModel) {
        Employee theEmployee = employeeService.findById(theId);
        theModel.addAttribute("employee", theEmployee);
        return "employees/employee-form";
    }

    @PostMapping("/save")
    public String saveEmployeeData(@ModelAttribute("employee") Employee theEmployee){
        employeeService.save(theEmployee);
        return "redirect:/employees/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("employeeId") int theId) {

        employeeService.deleteById(theId);

        return "redirect:/employees/list";

    }

}
