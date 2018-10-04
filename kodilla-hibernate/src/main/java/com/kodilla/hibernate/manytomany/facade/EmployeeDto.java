package com.kodilla.hibernate.manytomany.facade;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@NamedNativeQuery(
        name = "EmployeeDto.findEmployeeByExtract",
        query = "SELECT * FROM EMPLOYEES" +
                " WHERE LASTNAME LIKE ('%' + :LASTNAME + '%')",
        resultClass = EmployeeDto.class
)
@Entity
@Table(name = "EMPLOYEES")
public final class EmployeeDto {
    private int id;
    private String firstName;
    private String lastName;
    private List<CompanyDto> companies;

    public EmployeeDto() {
    }

    public EmployeeDto(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.companies = new ArrayList<>();
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "FIRSTNAME")
    public String getFirstName() {
        return this.firstName;
    }

    @NotNull
    @Column(name = "LASTNAME")
    public String getLastName() {
        return this.lastName;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "JOIN_COMPANY_EMPLOYEE",
            joinColumns = {@JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "ID")},
            inverseJoinColumns = {@JoinColumn(name = "COMPANY_ID", referencedColumnName = "ID")}
    )

    public List<CompanyDto> getCompanies() {
        return companies;
    }

    private void setCompanies(List<CompanyDto> companies) {
        this.companies = companies;
    }

    @Override
    public String toString() {
        return "Employee: " +
                "id = " + id +
                ", firstName = " + firstName +
                ", lastName = " + lastName +
                ", companies = " + companies;
    }
}
