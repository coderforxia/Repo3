package com.team.dubbo;

import com.team.dubbo.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DubboProviderApplicationTests {

    @Autowired
    private StudentService studentService;

    //测试下业务（本工程）
    @Test
    void contextLoads() {
        System.out.println("总共查询"+this.studentService.getAllStudent().size()+"行");
    }

}
