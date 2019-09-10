package com.sunnsoft.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author AlanViast
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Object index() {
        return "";
    }


}
