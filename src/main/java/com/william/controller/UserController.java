package com.william.controller;

import com.william.pojo.User;
import com.william.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserServices userServices;

    // 用戶登陸與註冊一體化的方法
    public String registerOrLogin(User user) {
        User userResult = userServices.queryUserNameIsExist(user.getUsername());
        if(userResult != null) { // 用戶存在，可以登陸
            // 一般來說，密碼會經過加密再比對
            if(userResult.getPassword().equals(user.getPassword())) {

            }
        } else { // 註冊

        }
        return "";
    }

    @RequestMapping("/getUser")
    public String getUserById(String id, Model model){
        User user = userServices.getUserById(id);
        model.addAttribute("user", user);

        return "user_list";
    }
}
