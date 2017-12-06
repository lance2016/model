package com.lance.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lance on 2017/12/6.
 */
@Controller
@RequestMapping("/demo")
public class DemoController {
    @RequestMapping("/index")
    public String index(){
        System.out.println("shenmegui a");
        return "index";
    }
}
