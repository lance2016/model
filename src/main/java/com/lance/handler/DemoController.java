package com.lance.handler;

import com.lance.entity.Msg;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.Map;
/**
 * Created by lance on 2017/12/6.
 */
@Controller
public class DemoController {

    @RequestMapping(value={"/welcome","/"},method=RequestMethod.GET)
    public String welcome(Map<String,Object> map){
        Msg msg = new Msg("测试标题", "测试内容", "额外信息，只对管理员显示");
        map.put("msg",msg);
        return "index";
    }


    @RequestMapping(value = "/loginPage", method = RequestMethod.GET)
    public String loginPage(@RequestParam(value = "error", required = false) String error) {
        if (error != null) {
            return "login-failure";
        }
        return "login";
    }
    //权限不够跳转页面
    @RequestMapping(value = "/403",method = RequestMethod.GET)
    public ModelAndView accessDenied(){
        ModelAndView model = new ModelAndView();
        Authentication auth= SecurityContextHolder.getContext().getAuthentication();
        if (!(auth instanceof AnonymousAuthenticationToken)) {
                UserDetails userDetail = (UserDetails) auth.getPrincipal();
                model.addObject("username", userDetail.getUsername());
        }
        model.setViewName("403");
        return model;
    }
}
