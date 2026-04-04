package com.cg.__4_26Assesment.service;

import java.util.List;
import com.cg.__4_26Assesment.entity.Emp;

public interface EmpService {

    List<Emp> getAllEmployees();

    Emp getEmployeeById(Integer id);

    void saveEmployee(Emp emp);

    void deleteEmployee(Integer id);
}