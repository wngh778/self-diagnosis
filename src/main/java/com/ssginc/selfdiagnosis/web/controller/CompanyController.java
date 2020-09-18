package com.ssginc.selfdiagnosis.web.controller;

import com.ssginc.selfdiagnosis.web.model.Company;
import com.ssginc.selfdiagnosis.web.repository.CompanyRepository;
import com.ssginc.selfdiagnosis.web.service.SequenceGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CompanyController {

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private SequenceGeneratorService sequenceGeneratorService;

    @Autowired

    /* 조직 관리 페이지 */
    @GetMapping("/group")
    public ModelAndView groupPage () {
        ModelAndView modelAndView = new ModelAndView();
        List<Company> companyList = companyRepository.findAll();
        modelAndView.setViewName("group_manage");
        modelAndView.addObject("companyList", companyList);
        return modelAndView;
    }

    @GetMapping("/company")
    public List<Company> getAllCompanies() {
        List<Company> companyList = companyRepository.findAll();
        return companyList;
    }

    @PostMapping("/company")
    public Company createCompany(@Valid @RequestBody Company company) {
        company.setSeq(sequenceGeneratorService.generateSequence(Company.SEQUENCE_NAME));
        return companyRepository.save(company);
    }
}
