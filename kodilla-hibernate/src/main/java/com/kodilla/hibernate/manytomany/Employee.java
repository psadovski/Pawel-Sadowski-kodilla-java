package com.kodilla.hibernate.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@NamedQuery(
        name = "Employee.findEmployeeByLastName",
        query = "FROM Employee WHERE lastName = :LASTNAME"
)
@Entity
@Table(name = "EMPLOYEES")
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private List<Company> companies;

    public Employee() {
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.companies = new ArrayList<>();
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "EMPLOYEE_ID", unique = true)
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
            joinColumns = {@JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "EMPLOYEE_ID")},
            inverseJoinColumns = {@JoinColumn(name = "COMPANY_ID", referencedColumnName = "COMPANY_ID")}
    )

    public List<Company> getCompanies() {
        return companies;
    }

    private void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(companies, employee.companies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, companies);
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
