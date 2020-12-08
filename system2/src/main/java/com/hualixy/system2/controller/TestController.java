package com.hualixy.system2.controller;

import com.hualixy.system2.domain.Test;
import com.hualixy.system2.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
* @Description:
 *              @RestController = @RestController注解相当于@ResponseBody ＋ @Controller合在一起的作用
 *                 返回的是jsp的是controller层的字符内容。
 *              @Controller :
 *                 返回的是jsp页面。
* @Author: GuiQingChen
* @Date: 2020/11/20
 */

@RestController
@ResponseBody
public class TestController {

    private static final Logger LOG= LoggerFactory.getLogger(TestController.class);


    @Autowired
    public TestService testService;

    @RequestMapping("/test")
    public List<Test> test(){
        LOG.info("controller..");
        return testService.list();
    }

    @RequestMapping("/test1")
    public String test1(){
        return "success";
    }
}
