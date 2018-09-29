package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.facade.dao.CompanyDtoDao;
import com.kodilla.hibernate.manytomany.facade.dao.EmployeeDtoDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class SearchFacade {

    @Autowired
    private EmployeeDtoDao employeeDtoDao;
    @Autowired
    private CompanyDtoDao companyDtoDao;
    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);

    public ResultDto search(String searchExtract) throws SearchException {
        List<EmployeeDto> employeesList = employeeDtoDao.findEmployeeByExtract(searchExtract);
        List<CompanyDto> companieslist = companyDtoDao.findCompanyByExtract(searchExtract);

        LOGGER.info("Searching for employees...");
        if (employeesList.size() < 1) {
            LOGGER.error(SearchException.ERR_EMPLOYEE_NOT_FOUND);
            throw new SearchException(SearchException.ERR_EMPLOYEE_NOT_FOUND);
        } else {
            new ResultDto().setEmployeeList(employeesList);
            LOGGER.info("List of matching employees: ");
            for (EmployeeDto employee : employeesList) {
                LOGGER.info("Employee: " + employee.getFirstName() + " " + employee.getLastName());
            }
        }

        LOGGER.info("Searching for companies...");
        if (companieslist.size() < 1) {
            LOGGER.error(SearchException.ERR_COMPANY_NOT_FOUND);
            throw new SearchException(SearchException.ERR_COMPANY_NOT_FOUND);
        } else {
            new ResultDto().setCompanyList(companieslist);
            LOGGER.info("List of matching companies: ");
            for (CompanyDto company : companieslist) {
                LOGGER.info("Company: " + company.getName());
            }
        }
        return new ResultDto();
    }
}
