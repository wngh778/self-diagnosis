package com.ssginc.selfdiagnosis.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    /* 조직 관리 페이지 */
    @GetMapping(value = "/group")
    public String manageGroup(){
        System.out.println("group test 1");
        return "group_manage";
    }
}
