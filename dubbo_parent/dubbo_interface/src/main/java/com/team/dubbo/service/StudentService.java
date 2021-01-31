package com.team.dubbo.service;

import com.team.dubbo.entity.Student;

import java.util.List;

/**
 * @author 王建兵
 * @Classname StudentService
 * @Description TODO
 * @Date 2021/1/27 10:53
 * @Created by Administrator
 */
//一个接口就解一个服务（服务包含很多的方法）
public interface StudentService {
    /*添加，修改，查询，删除，搜索分页....*/
    //查询所有学生
    public List<Student> getAllStudent();
}
