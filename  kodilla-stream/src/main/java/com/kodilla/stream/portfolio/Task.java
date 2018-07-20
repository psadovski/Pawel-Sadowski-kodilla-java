package com.kodilla.stream.portfolio;

import java.time.LocalDate;

public final class Task {
    private final String title;
    private final String description;
    private final User assignedUser;
    private final User creator;
    private final LocalDate created;
    private final LocalDate deadline;

    public Task(final String title, final String description, final User assignedUser, final User creator, final LocalDate created, final LocalDate deadline) {
        this.title = title;
        this.description = description;
        this.assignedUser = assignedUser;
        this.creator = creator;
        this.created = created;
        this.deadline = deadline;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public User getAssignedUser() {
        return this.assignedUser;
    }

    public User getCreator() {
        return this.creator;
    }

    public LocalDate getCreated() {
        return this.created;
    }

    public LocalDate getDeadline() {
        return this.deadline;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", assignedUser=" + assignedUser +
                ", creator=" + creator +
                ", created=" + created +
                ", deadline=" + deadline +
                '}';
    }
}
