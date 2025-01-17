package com.erkinkubatov.springMVC_Hibernate_AOP.controller;


import com.erkinkubatov.springMVC_Hibernate_AOP.dao.EmployeeDAO;
import com.erkinkubatov.springMVC_Hibernate_AOP.entity.Employee;
import com.erkinkubatov.springMVC_Hibernate_AOP.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String showAllEmployees(Model model) {

        List<Employee> allEmployees = employeeService.getAllEmployees();
        model.addAttribute("allEmps", allEmployees);
        return "all-employees-view";
    }


    @RequestMapping("/add-new-employee")
    public String employeeInfo(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "employee-info-view";
    }

    @RequestMapping("/save-employee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/";
    }

    @RequestMapping("/update-info")
    public String updateEmployee(@RequestParam("empId") int id, Model model) {
        Employee employee = employeeService.getEmployeeById(id);
        model.addAttribute("employee", employee);
        return "employee-info-view";
    }


    @RequestMapping("/delete-employee")
    public String deleteEmployee(@RequestParam("empId") int id) {
        employeeService.deleteEmployee(id);
        return "redirect:/";
    }
}
