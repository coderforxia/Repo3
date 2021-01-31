package com.team.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.team.dubbo.entity.Student;
import com.team.dubbo.service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 王建兵
 * @Classname StudentController
 * @Description TODO
 * @Date 2021/1/27 11:28
 * @Created by Administrator
 */
@RestController
public class StudentController {
    //调用dubbo的服务
    @Reference(interfaceClass = StudentService.class,check = false)
    private StudentService studentService;

    @RequestMapping("/showStudent")
    public List<Student> showStudent(){
      return  this.studentService.getAllStudent();
    }
}
