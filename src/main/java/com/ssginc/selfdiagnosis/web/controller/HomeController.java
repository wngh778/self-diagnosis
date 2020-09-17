package com.ssginc.selfdiagnosis.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {

    /* 조직 관리 페이지 */
    @GetMapping(value = "/group")
    public String manageGroup(){
        System.out.println("group test 1");
        return "group_manage";
    }

    @GetMapping(value = "/userChecklist")
    public ModelAndView userCheckList(){
        ModelAndView mav = new ModelAndView("user_checklist");

        return mav;
    }

    @GetMapping(value = "/userMain")
    public ModelAndView userMain(){
        ModelAndView mav = new ModelAndView("user_main");

        return mav;
    }

    @GetMapping(value = "/userResult")
    public ModelAndView userResult(){
        ModelAndView mav = new ModelAndView("user_result");

        return mav;
    }
}
