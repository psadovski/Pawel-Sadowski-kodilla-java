package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.facade.dao.CompanyDtoDao;
import com.kodilla.hibernate.manytomany.facade.dao.EmployeeDtoDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchFacadeTestSuite {

    @Autowired
    private SearchFacade searchFacade;

    @Autowired
    private CompanyDtoDao companyDtoDao;

    @Autowired
    private EmployeeDtoDao employeeDtoDao;

    @Test
    public void testSearchEployee() {
        //Given
        searchFacade.addEmployeeForCompany(new CompanyDto("Software Machine"), new EmployeeDto("John", "Smith"));
        searchFacade.addEmployeeForCompany(new CompanyDto("Software Machine"), new EmployeeDto("Linda", "Kovalsky"));
        searchFacade.addEmployeeForCompany(new CompanyDto("Data Masters"), new EmployeeDto("Stephanie", "Clarckson"));
        searchFacade.addEmployeeForCompany(new CompanyDto("Data Masters"), new EmployeeDto("Garry", "Clarckson"));

        //When
        List<EmployeeDto> employees = new ArrayList<>();
        try {
            employees = searchFacade.searchEmployee("lar");
        } catch (SearchException e) {
        }

        //Then
        Assert.assertEquals(2, employees.size());

        //CleanUp
        try {
            companyDtoDao.deleteAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSearchCompany() {
        //Given
        searchFacade.addCompanyForEmployee(new EmployeeDto("John", "Smith"), new CompanyDto("Software Machine"));
        searchFacade.addCompanyForEmployee(new EmployeeDto("John", "Smith"), new CompanyDto("Software Machine"));
        searchFacade.addCompanyForEmployee(new EmployeeDto("Stephanie", "Clarckson"), new CompanyDto("Data Masters"));
        searchFacade.addCompanyForEmployee(new EmployeeDto("Garry", "Clarckson"), new CompanyDto("Data Masters"));

        //When
        List<CompanyDto> companies = new ArrayList<>();
        try {
            companies = searchFacade.searchCompany("ware");
        } catch (SearchException e) {
        }

        //Then
        Assert.assertEquals(1, companies.size());

        //CleanUp
        try {
            employeeDtoDao.deleteAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
