package com.robin.springboot04webcrud.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.robin.springboot04webcrud.entities.Department;
import com.robin.springboot04webcrud.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {

	private static Map<Integer, Employee> employees = null;
	
	@Autowired
	private DepartmentDao departmentDao;
	
	static{
		employees = new HashMap<Integer, Employee>();

		employees.put(10, new Employee(10, "Messi", "Argentina", 1, new Department(101, "RF")));
		employees.put(3, new Employee(3, "Pique", "Spain", 1, new Department(102, "CB")));
		employees.put(7, new Employee(7, "Griezmann", "France", 0, new Department(103, "CF")));
		employees.put(21, new Employee(21, "De Jong", "Netherlands", 0, new Department(104, "CM")));
		employees.put(1, new Employee(1, "Ter Stergen", "Germany", 0, new Department(105, "GK")));
	}
	
	private static Integer initId = 1006;
	
	public void save(Employee employee){
		if(employee.getId() == null){
			employee.setId(initId++);
		}
		
		employee.setDepartment(departmentDao.getDepartment(employee.getDepartment().getId()));
		employees.put(employee.getId(), employee);
	}
	
	public Collection<Employee> getAll(){
		return employees.values();
	}
	
	public Employee get(Integer id){
		return employees.get(id);
	}
	
	public void delete(Integer id){
		employees.remove(id);
	}
}
