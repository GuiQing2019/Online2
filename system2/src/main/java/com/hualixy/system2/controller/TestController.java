package com.hualixy.system2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
@RequestMapping(value = "customer")
public class TestController {

   /**
   * @Description: test方法
   * @Param: []
   * @return: java.lang.String
   * @Author: GuiQingChen
   * @Date: 2020/11/20
    */
    @GetMapping(value = "test")
    public String test(){
        return "succeed";
    }
}
