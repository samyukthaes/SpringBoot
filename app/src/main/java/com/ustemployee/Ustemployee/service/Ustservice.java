package com.ustemployee.Ustemployee.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustemployee.Ustemployee.model.Ustmodel;
import com.ustemployee.Ustemployee.repository.Ustrepository;
@Service
public class Ustservice {
	@Autowired
    private Ustrepository repo;
	public Ustmodel createEmployee(Ustmodel employee) {
		// TODO Auto-generated method stub
		return repo.save(employee);
		
	}

	public List<Ustmodel> getEmployee() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	public Ustmodel getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	public Ustmodel UpdateEmployee(Ustmodel employee) {
		// TODO Auto-generated method stub
		Ustmodel oldemp=null;
	    Optional<Ustmodel> optionalemployee=repo.findById(employee.getId());
		if(optionalemployee.isPresent()) {
			oldemp=optionalemployee.get();
		    oldemp.setEmpname(employee.getName());
		    oldemp.setEmail(employee.getEmail());
		    oldemp.setExperience(employee.getExperience());
		    oldemp.setDomain(employee.getDomain());
		    repo.save(oldemp);
		}
		else {
		    }
		    return oldemp;
	}
	

	public String deleteEmployee(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return  "employee info is deleted";
	}

}

