package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.facade.dao.CompanyDtoDao;
import com.kodilla.hibernate.manytomany.facade.dao.EmployeeDtoDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
    public void testSearchEployeeAndCompnyByExtract() {
        //Given
        EmployeeDto johnSmith = new EmployeeDto("John", "Smith");
        EmployeeDto stephanieClarckson = new EmployeeDto("Stephanie", "Clarckson");
        CompanyDto softwareMachine = new CompanyDto("Software Machine");
        CompanyDto dataMaesters = new CompanyDto("Data Masters");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        johnSmith.getCompanies().add(softwareMachine);
        stephanieClarckson.getCompanies().add(dataMaesters);

        companyDtoDao.save(softwareMachine);
        companyDtoDao.save(dataMaesters);
        employeeDtoDao.save(johnSmith);
        employeeDtoDao.save(stephanieClarckson);

        //When
        ResultDto result = new ResultDto();
        try {
            result = searchFacade.search("lar");
        } catch (SearchException e) {
        }

        //Then
        Assert.assertEquals(1, result.getEmployees().size());
        Assert.assertEquals(0, result.getCompanies().size());

        //CleanUp
        try {
            companyDtoDao.deleteAll();
            employeeDtoDao.deleteAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
