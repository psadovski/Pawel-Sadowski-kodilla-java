package com.kodilla.testing.library;

import java.util.Objects;

public class LibraryUser {
    private final String firstname;
    private final String lastname;
    private final String peselId;

    public LibraryUser(final String firstname, final String lastname, final String peselId) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.peselId = peselId;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public String getPeselId() {
        return this.peselId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LibraryUser)) return false;
        LibraryUser that = (LibraryUser) o;
        return Objects.equals(getFirstname(), that.getFirstname()) &&
                Objects.equals(getLastname(), that.getLastname()) &&
                Objects.equals(getPeselId(), that.getPeselId());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getFirstname(), getLastname(), getPeselId());
    }

    @Override
    public String toString() {
        return "LibraryUser{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", peselId='" + peselId + '\'' +
                '}';
    }
}
