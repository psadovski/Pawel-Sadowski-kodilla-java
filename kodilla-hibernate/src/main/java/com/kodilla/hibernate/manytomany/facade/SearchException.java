package com.kodilla.hibernate.manytomany.facade;

public class SearchException extends Exception {

    public static String ERR_COMPANY_NOT_FOUND = "Company has not found.";
    public static String ERR_EMPLOYEE_NOT_FOUND = "Employee has not found";

    public SearchException(String message) {
        super(message);
    }
}
