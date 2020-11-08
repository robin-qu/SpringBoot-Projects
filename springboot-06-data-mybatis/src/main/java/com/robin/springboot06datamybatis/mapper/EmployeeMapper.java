package com.robin.springboot06datamybatis.mapper;

import com.robin.springboot06datamybatis.bean.Employee;
import org.apache.ibatis.annotations.Mapper;

//@Mapper
public interface EmployeeMapper {
    Employee getEmployee(Integer id);

    void insertEmployee(Employee employee);
}
