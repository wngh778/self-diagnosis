package com.ssginc.selfdiagnosis.web.controller;

import com.ssginc.selfdiagnosis.web.model.Company;
import com.ssginc.selfdiagnosis.web.repository.CompanyRepository;
import com.ssginc.selfdiagnosis.web.service.SequenceGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CompanyController {

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private SequenceGeneratorService sequenceGeneratorService;

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
