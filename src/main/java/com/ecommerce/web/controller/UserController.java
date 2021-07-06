package com.ecommerce.web.controller;

import com.ecommerce.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    UserServices userServices;

    public String getUserProfile(){
        return null;
    }
    public String getUserCart(){
        return null;
    }
}
