package com.practice.SpringBootDemo.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.SpringBootDemo.entity.Department;
import com.practice.SpringBootDemo.repository.DepartmentRepository;

@Service 
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	DepartmentRepository departmentRepo;

	@Override
	public Department saveDepartment(Department department) {
		return departmentRepo.save(department);
	}

	@Override
	public List<Department> getDepartments() {
		return departmentRepo.findAll();
	}

	@Override
	public Department getDepartmentById(Long id) {
		return departmentRepo.findById(id).get();
	}

	@Override
	public void deleteDepartmentById(Long id) {
		departmentRepo.deleteById(id);
	}

	@Override
	public Department updateDepartmentById(Long id, Department department) {
		Department de = departmentRepo.findById(id).get();
		
		if(Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())) {
			de.setDepartmentName(department.getDepartmentName());
		}
		if(Objects.nonNull(department.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress())) {
			de.setDepartmentAddress(department.getDepartmentAddress());
		}
		if(Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())) {
			de.setDepartmentCode(department.getDepartmentCode());
		}
		
		return de;
	}

	@Override
	public Department fetchDepartmentByName(String name) {
		return departmentRepo.findByDepartmentName(name);
	}
	
	

	
}
