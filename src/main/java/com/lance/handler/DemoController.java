package com.lance.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by lance on 2017/12/6.
 */
@Controller
public class DemoController {

    @RequestMapping(value={"/welcome","/"},method=RequestMethod.GET)
    public String welcome(){
        return "index";
    }


    @RequestMapping(value = "/loginPage", method = RequestMethod.GET)
    public String loginPage(@RequestParam(value = "error", required = false) String error) {
        if (error != null) {
            return "login-failure";
        }
        return "login";
    }
}
