package com.ustemployee.Ustemployee.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ustemployee.Ustemployee.model.Ustmodel;
import com.ustemployee.Ustemployee.service.Ustservice;


@RestController
@RequestMapping("/emp/registration")
@CrossOrigin("*")
public class UstController {
	@Autowired
    private Ustservice  services;
	@PostMapping("/addemps")
	public Ustmodel address(@RequestBody Ustmodel employee) {
		return services.createEmployee(employee);
	}
	@GetMapping("/employee")
	public List <Ustmodel> getAllEmployee(){
	     return services.getEmployee();
   }
   @GetMapping("/employees/{id}")
   public Ustmodel getEmployeeById(@PathVariable int  id){
         return services.getEmployeeById(id);
   }
   @PutMapping("/updateemployee/{id}")
   public Ustmodel updateEmployee(@RequestBody Ustmodel employee) {
         return services.UpdateEmployee(employee);
   }
   @DeleteMapping("/deleteemployee/{id}")
   public String deleteEmployee(@PathVariable int  id){
       return services.deleteEmployee(id);
 }
   }

