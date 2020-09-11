package com.ssginc.selfdiagnosis;

import com.ssginc.selfdiagnosis.web.controller.CompanyController;
import com.ssginc.selfdiagnosis.web.model.Company;
import com.ssginc.selfdiagnosis.web.repository.CompanyRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SelfDiagnosisApplication.class)
public class CompanyTest {

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private CompanyController companyController;


    @Value("${spring.data.mongodb.database}")
    String database;


    @Test
    public void insertCompanyData()
    {
        Company company = new Company();
        company.setCompany_id("ssg002");
        company.setCompany_name("백화점팀");
        company.setAdmin("ssgadmin002");
        company.setDomain("@shinsegae.com");
        company.setDiagnosis_url("ssg-selfdiagnosis.com/ssg002");
        System.out.println(companyController.createCompany(company));
    }


    @Test
    public void selectCompanyData()
    {
        System.out.println(companyController.getAllCompanies());
    }


}
