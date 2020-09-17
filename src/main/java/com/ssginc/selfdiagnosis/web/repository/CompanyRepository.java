package com.ssginc.selfdiagnosis.web.repository;

import com.ssginc.selfdiagnosis.web.model.Company;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CompanyRepository extends MongoRepository<Company, Long> {

    @Override
    List<Company> findAll();

    @Override
    Company save(Company company);

    @Override
    Optional<Company> findById(Long aLong);

    //@Query("db.company.find({ \"$or\": [{company_id: /001/}, {company_name: /아이앤씨/}]})")
    //List<Company> findByIdOrName(String name);
}