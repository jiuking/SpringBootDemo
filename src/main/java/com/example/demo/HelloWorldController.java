package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping("/index")
    public String index() {
        return "welcome";
    }

    /**
     * @Author: Administrator
     * @Description: 测试是否关联上git
     * @param: null
     * @Date: 09:28 2018/1/29 0029
     * @return:
     * @throws:
     */
    @RequestMapping("/test")
    public String test() {
        return "welcome";
    }
}
