package com.ustemployee.Ustemployee.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ustemployee.Ustemployee.model.Ustmodel;

@Repository
public interface Ustrepository extends JpaRepository<Ustmodel,Integer>{
	
}
