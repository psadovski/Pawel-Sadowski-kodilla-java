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

    public void addEmployeeForCompany(CompanyDto companyDto, EmployeeDto employeeDto) {
        companyDto.getEmployees().add(employeeDto);
        companyDtoDao.save(companyDto);
    }

    public void addCompanyForEmployee(EmployeeDto employeeDto, CompanyDto companyDto) {
        employeeDto.getCompanies().add(companyDto);
        employeeDtoDao.save(employeeDto);
    }

    public List<EmployeeDto> searchEmployee(String searchExtract) throws SearchException {
        LOGGER.info("Searching for employees...");
        List<EmployeeDto> employeeList = employeeDtoDao.findEmployeeByExtract(searchExtract);

        if (employeeList.size() < 1) {
            LOGGER.error(SearchException.ERR_EMPLOYEE_NOT_FOUND);
            throw new SearchException(SearchException.ERR_EMPLOYEE_NOT_FOUND);
        } else {
            LOGGER.info("List of matching employees: ");
            for (EmployeeDto employee : employeeList ) {
                LOGGER.info("Employee: " + employee.getFirstName() + " " + employee.getLastName());
            }
        }
        return employeeList;
    }

    public List<CompanyDto> searchCompany(String searchExtract) throws SearchException {
        LOGGER.info("Searching for companies...");
        List<CompanyDto> companieslist = companyDtoDao.findCompanyByExtract(searchExtract);

        if (companieslist.size() < 1) {
            LOGGER.error(SearchException.ERR_COMPANY_NOT_FOUND);
            throw new SearchException(SearchException.ERR_COMPANY_NOT_FOUND);
        } else {
            LOGGER.info("List of matching companies: ");
            for (CompanyDto company : companieslist) {
                LOGGER.info("Company: " + company.getName());
            }
        }
        return companieslist;
    }
}
