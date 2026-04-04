package com.cg.__4_26Assesment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.__4_26Assesment.entity.Emp;

public interface EmpRepository extends JpaRepository<Emp, Integer> {
}