package com.myemployee.myemployee.repository;

import com.myemployee.myemployee.model.employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<employee, Long> {
}
