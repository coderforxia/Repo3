package com.team.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.team.dubbo.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 王建兵
 * @Classname TestController
 * @Description TODO
 * @Date 2021/1/26 11:20
 * @Created by Administrator
 */
@RestController
public class TestController {
    //使用@Reference注解引用远程服务
    //将服务提供者接口，复制一份到消费者工程,而且接口所在的包的限定名要一致
    @Reference(interfaceClass =TestService.class,check = false)
    private TestService testService;   //引用远程对象调用

    @RequestMapping("/getHw")
    public String getHw(){
       //调用服务方法
       String result=testService.getHelloWord();  //远程
       return result;
    }
}
