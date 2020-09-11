package com.ssginc.selfdiagnosis.web.repository;

import com.ssginc.selfdiagnosis.web.model.Company;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends MongoRepository<Company, Long> {

    @Override
    public List<Company> findAll();

    @Override
    public Company save(Company company);
}
