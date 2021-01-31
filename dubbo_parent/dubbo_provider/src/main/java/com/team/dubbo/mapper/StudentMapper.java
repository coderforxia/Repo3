package com.team.dubbo.mapper;

import com.team.dubbo.entity.Student;
import com.team.dubbo.entity.StudentExample;
import java.util.List;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer xh);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExample(StudentExample example);

    Student selectByPrimaryKey(Integer xh);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}