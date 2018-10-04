package com.kodilla.hibernate.manytomany.facade;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@NamedNativeQuery(
        name = "CompanyDto.findCompanyByExtract",
        query = "SELECT * FROM COMPANIES" +
                " WHERE NAME LIKE ('%' + :COMPANY + '%')",
        resultClass = CompanyDto.class
)
@Entity
@Table(name = "COMPANIES")
public final class CompanyDto {
    private int id;
    private String name;
    private List<EmployeeDto> employees;

    public CompanyDto() {
    }

    public CompanyDto(final String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return this.id;
    }

    @NotNull
    @Column(name = "NAME")
    public String getName() {
        return this.name;
    }

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<EmployeeDto> getEmployees() {
        return this.employees;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setEmployees(List<EmployeeDto> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Company: " +
                "id = " + id +
                ", name = " + name +
                ", employees = " + employees;
    }
}
