package com.team.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.team.dubbo.service.TestService;
import org.springframework.stereotype.Component;

/**
 * @author 王建兵
 * @Classname TestServiceImpl
 * @Description TODO
 * @Date 2021/1/26 10:36
 * @Created by Administrator
 */
//发布远程服务
@Service(interfaceClass = TestService.class,timeout = 2000)
@Component   //创建本地bean对象
public class TestServiceImpl implements TestService {
    @Override
    public String getHelloWord() {
        return "helloword";
    }
}
