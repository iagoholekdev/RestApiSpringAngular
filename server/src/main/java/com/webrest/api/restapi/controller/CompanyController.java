package com.webrest.api.restapi.controller;

import com.webrest.api.restapi.model.CompanyModel;
import com.webrest.api.restapi.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class CompanyController {
    private final CompanyRepository companyRepository;

    public CompanyController(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @GetMapping
    @RequestMapping("/company/getCompany")
    public List<CompanyModel> List() {
        return companyRepository.findAll();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping("/company/insertCompany")
    public CompanyModel addCompany(@RequestBody CompanyModel companyModel) {
        return companyRepository.save(companyModel);
    }


}
