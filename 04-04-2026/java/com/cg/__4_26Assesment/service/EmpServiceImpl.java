package com.cg.__4_26Assesment.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.__4_26Assesment.entity.Emp;
import com.cg.__4_26Assesment.repository.EmpRepository;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpRepository repo;

    @Override
    public List<Emp> getAllEmployees() {
        return repo.findAll();
    }

    @Override
    public Emp getEmployeeById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void saveEmployee(Emp emp) {
        repo.save(emp);
    }

    @Override
    public void deleteEmployee(Integer id) {
        repo.deleteById(id);
    }
}