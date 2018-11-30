package com.ws.webservice_server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@RequestMapping(value="/phone")
@Controller
public class PhoneController {

    @RequestMapping("index")
    public String index(){
    return "Hello World!";
    }

    @RequestMapping(value="/getmap")
        public Map<String,String> getMap(){
        Map<String,String> phoneMap = new HashMap<String,String>();
        phoneMap.put("name", "apple phone");
        phoneMap.put("money", "5000");
        return phoneMap;
    }
}
