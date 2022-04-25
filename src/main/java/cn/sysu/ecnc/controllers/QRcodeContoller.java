package cn.sysu.ecnc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QRcodeContoller {
    @RequestMapping("/")
    public String QRcode(){
        return "index";
    }
}
