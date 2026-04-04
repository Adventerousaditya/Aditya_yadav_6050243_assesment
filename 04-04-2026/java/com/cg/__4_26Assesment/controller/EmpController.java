package com.cg.__4_26Assesment.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

import com.cg.__4_26Assesment.dto.EmpDto;
import com.cg.__4_26Assesment.entity.Emp;
import com.cg.__4_26Assesment.service.EmpServiceImpl;

@Controller
public class EmpController {

    @Autowired
    private EmpServiceImpl service;

    @GetMapping("/viewall")
    public String viewAll(Model model) {
        model.addAttribute("emps", service.getAllEmployees());
        return "view";
    }

    @GetMapping("/edit/{eid}")
    public String edit(@PathVariable Integer eid, Model model) {

        Emp emp = service.getEmployeeById(eid);

        EmpDto dto = new EmpDto();
        BeanUtils.copyProperties(emp, dto);

        model.addAttribute("empDto", dto);
        return "edit";
    }

    @PostMapping("/update")
    public String update(@Valid @ModelAttribute("empDto") EmpDto dto,
                         BindingResult result,
                         Model model) {

        if (result.hasErrors()) {
            return "edit";
        }

        Emp emp = new Emp();
        BeanUtils.copyProperties(dto, emp);

        service.saveEmployee(emp);

        model.addAttribute("msg", "Employee Edited");
        model.addAttribute("emps", service.getAllEmployees());

        return "view";
    }

    @GetMapping("/delete/{eid}")
    public String delete(@PathVariable Integer eid, Model model) {

        service.deleteEmployee(eid);

        model.addAttribute("msg", "Employee Deleted");
        model.addAttribute("emps", service.getAllEmployees());

        return "view";
    }
}