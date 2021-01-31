package com.team.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.team.dubbo.entity.Student;
import com.team.dubbo.entity.StudentExample;
import com.team.dubbo.mapper.StudentMapper;
import com.team.dubbo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 王建兵
 * @Classname StudentServiceImpl
 * @Description TODO
 * @Date 2021/1/27 11:21
 * @Created by Administrator
 */
@Service(interfaceClass =StudentService.class)
@Component
public class StudentServiceImpl implements StudentService {
    @Autowired(required = false)
    private StudentMapper studentMapper;

    @Override
    public List<Student> getAllStudent() {
        return studentMapper.selectByExample(new StudentExample());
    }
}
