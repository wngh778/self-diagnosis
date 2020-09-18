package com.ssginc.selfdiagnosis.web.controller;

import com.ssginc.selfdiagnosis.web.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

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
