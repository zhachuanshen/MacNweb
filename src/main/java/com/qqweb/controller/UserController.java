package com.qqweb.controller;

import com.qqweb.Model.User;
import com.qqweb.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
/**
 * Created by chuanshen on 2017/8/23.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private UserService uS;

    public UserService getuS() {
        return uS;
    }
    @Autowired
    public void setuS(UserService uS) {
        this.uS = uS;
    }
    @RequestMapping("/eat")
    @ResponseBody
    public Map<String, Object> eat(HttpServletRequest req, HttpServletResponse resp) {

        resp.setCharacterEncoding("utf8");
        resp.setHeader("Access-Control-Allow-Origin", "*");
        Map<String, Object> map = new HashMap<String, Object>();
        String name = req.getParameter("name");
        System.out.println("----------" + name);
        User user = uS.userSelect();
        map.put("name", user);
        System.out.println("-------" + user);
        return map;
    }
}

