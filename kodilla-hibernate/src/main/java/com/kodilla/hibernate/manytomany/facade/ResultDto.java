package com.kodilla.hibernate.manytomany.facade;

import java.util.ArrayList;
import java.util.List;

public class ResultDto {
    private List<EmployeeDto> employeeList = new ArrayList<>();
    private List<CompanyDto> companyList = new ArrayList<>();

    public List<EmployeeDto> getEmployeeList() {
        return this.employeeList;
    }

    public List<CompanyDto> getCompanyList() {
        return this.companyList;
    }

    public void setEmployeeList(List<EmployeeDto> employeeList) {
        this.employeeList = employeeList;
    }

    public void setCompanyList(List<CompanyDto> companyList) {
        this.companyList = companyList;
    }
}
