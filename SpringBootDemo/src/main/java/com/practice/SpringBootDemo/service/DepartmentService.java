package com.practice.SpringBootDemo.service;

import java.util.List;
import java.util.Optional;

import com.practice.SpringBootDemo.entity.Department;

public interface DepartmentService {

	Department saveDepartment(Department department);

	List<Department> getDepartments();

	Department getDepartmentById(Long id);

	void deleteDepartmentById(Long id);

	Department updateDepartmentById(Long id, Department department);

	Department fetchDepartmentByName(String name);

}
