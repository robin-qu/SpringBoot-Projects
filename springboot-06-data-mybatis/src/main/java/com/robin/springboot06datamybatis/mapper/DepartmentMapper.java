package com.robin.springboot06datamybatis.mapper;

import com.robin.springboot06datamybatis.bean.Department;
import org.apache.ibatis.annotations.*;

//@Mapper
public interface DepartmentMapper {
    @Select("select * from department where id=#{id}")
    Department getDepartmentById(Integer id);

    @Delete("delete from department where id=#{id}")
    int deleteDepartmentById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(department_name) values(#{departmentName})")
    int insertDepartment(Department department);

    @Update("update department set department_name=#{departmentName} where id=#{id}")
    int updateDepartment(Department department);
}
