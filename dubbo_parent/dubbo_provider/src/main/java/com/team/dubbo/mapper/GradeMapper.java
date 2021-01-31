package com.team.dubbo.mapper;

import com.team.dubbo.entity.Grade;
import com.team.dubbo.entity.GradeExample;
import java.util.List;

public interface GradeMapper {
    int deleteByPrimaryKey(Integer gid);

    int insert(Grade record);

    int insertSelective(Grade record);

    List<Grade> selectByExample(GradeExample example);

    Grade selectByPrimaryKey(Integer gid);

    int updateByPrimaryKeySelective(Grade record);

    int updateByPrimaryKey(Grade record);
}