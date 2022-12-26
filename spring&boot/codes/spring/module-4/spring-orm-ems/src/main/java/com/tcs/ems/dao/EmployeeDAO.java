package com.tcs.ems.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.tcs.ems.entity.Employee;

public class EmployeeDAO {
	@Autowired
	private HibernateTemplate template;
	
	@Transactional(readOnly = false)
	public void saveEmployee(Employee emp){  
	    template.save(emp);  
	}  

	@Transactional(readOnly = false)
	public void updateEmployee(Employee emp){  
	    template.update(emp);  
	}  

	@Transactional(readOnly = false)
	public void deleteEmployee(Employee e){  
	    template.delete(e);  
	}  

	public Employee findById(int id){  
	    Employee emp = (Employee)template.get(Employee.class,id);  
	    return emp;  
	}  

	public List<Employee> findAllEmployees(){  
	    List<Employee> list=new ArrayList<Employee>();  
	    list = template.loadAll(Employee.class);  
	    return list;  
	}  
	
}
