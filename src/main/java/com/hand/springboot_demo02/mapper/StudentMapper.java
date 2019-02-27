package com.hand.springboot_demo02.mapper;

import com.hand.springboot_demo02.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper {
    @Select("select * from student1")
    List<Student> findAll();
}
