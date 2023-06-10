package com.cc.controller;

/**
 * @descriptions:
 * @author: cc
 * @date: 2023/6/10 13:39
 * @version: 1.0
 */


import com.cc.config.HelloProperties;
import com.cc.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    //HelloService在我们自定义的starter中已经完成了自动配置，所以此处可以直接注入
    @Autowired
    private HelloService helloService;

    @Autowired
    private HelloProperties helloProperties;

    @GetMapping("/say")
    public String sayHello(){
        return helloService.sayHello()+helloProperties.toString();
    }
}
