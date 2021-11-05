package com.myemployee.myemployee.controller;

import com.myemployee.myemployee.model.employee;
import com.myemployee.myemployee.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class apicontroller {

    @Autowired
    private EmpRepo empRepo;

    @GetMapping (value = "/employee")
    public List<employee> getEmployee(){
        return empRepo.findAll();
    }

    @PostMapping (value = "/save")
    public String saveEmployee(@RequestBody employee employee){
        empRepo.save(employee);
        return "Date you have entered its created....";
    }

    @PutMapping (value = "/update/{id}")
    public String updateEmployee(@PathVariable long id, @RequestBody employee employee){
        employee updatedEmployee=empRepo.findById(id).get();
        updatedEmployee.setEmpid((employee.getEmpid()));
        updatedEmployee.setDept((employee.getDept()));
        updatedEmployee.setCompany((employee.getCompany()));
        updatedEmployee.setEmpname((employee.getEmpname()));
        empRepo.save(updatedEmployee);
        return "Changes Made";
    }

    @DeleteMapping (value = "/delete/{id}")
    public String deleteEmployee(@PathVariable Long id){
        employee deleteEmployee=empRepo.findById(id).get();
        empRepo.delete(deleteEmployee);
        return "Its Deleted";
    }
    }

