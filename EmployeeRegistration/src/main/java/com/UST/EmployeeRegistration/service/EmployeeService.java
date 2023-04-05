/**
 * 
 */
package com.UST.EmployeeRegistration.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UST.EmployeeRegistration.model.Employee;
import com.UST.EmployeeRegistration.repository.EmployeeRepo;

/**
 * @author Administrator
 *
 */
@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo repo;

	public Employee CreateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return repo.save(employee);
	}

	public List<Employee> getEmployee() {
		
		return repo.findAll();
	}

	public Employee getEmployeeById(int id) {
		
		return repo.findById(id).orElse(null);
	}

	public Employee updateEmployee(Employee employee) {
		Employee oldemp=null;
		Optional<Employee>optionalemployee=repo.findById(employee.getId());
		if(optionalemployee.isPresent())
		{
			oldemp=optionalemployee.get();
			oldemp.setName(employee.getName());
			oldemp.setAddress(employee.getAddress());
			repo.save(oldemp);
		}else {
			return new Employee();
		}
		return oldemp;
	}
		

	public String deleteEmployeeById(int id) {
		repo.deleteById(id);
		return "the employee information is deleted";
	}

}
