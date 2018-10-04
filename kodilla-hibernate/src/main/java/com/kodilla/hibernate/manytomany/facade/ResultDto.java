package com.kodilla.hibernate.manytomany.facade;

import java.util.ArrayList;
import java.util.List;

public class ResultDto {
    private List<EmployeeDto> employees = new ArrayList<>();
    private List<CompanyDto> companies = new ArrayList<>();

    public List<EmployeeDto> getEmployees() {
        return this.employees;
    }

    public List<CompanyDto> getCompanies() {
        return this.companies;
    }

    public void setEmployees(List<EmployeeDto> employees) {
        this.employees = employees;
    }

    public void setCompanies(List<CompanyDto> companies) {
        this.companies = companies;
    }
}
