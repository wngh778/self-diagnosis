package com.ssginc.selfdiagnosis.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document(collection = "company")
public class Company {

    @Transient
    public static final String SEQUENCE_NAME = "company_sequence";

    @Id
    private long seq;

    private String company_id;
    private String company_name;
    private String admin;
    private String domain;
    private String diagnosis_url;

    public Company() {
    }
}
