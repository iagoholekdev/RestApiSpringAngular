package com.webrest.api.restapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

@Entity
@Data
public class CompanyModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length=150, nullable = false)
    @JsonProperty("CompanyName")
    private String CompanyName;
    @Column(nullable = false)
    private int numberOfEmployees;
    @Column(length=300 , nullable = false)
    private String address;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompanyModel companyModel = (CompanyModel) o;
        return Objects.equals(id, companyModel.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    public CompanyModel addId(Long id)  {
        this.id = id;
        return this;
    }

    public CompanyModel addCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
        return this;
    }

    public CompanyModel addNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
        return this;
    }

    public CompanyModel addAddress(String address) {
        this.address = address;
        return this;
    }

    public String getCompanyName() {
        return this.CompanyName;
    }

    public int getNumberOfEmployees() {
        return this.numberOfEmployees;
    }

    public String getAddress() {
        return this.address;
    }

}
