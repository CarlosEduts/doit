package com.cedutdev.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Task {
    private final String id;
    private String title;
    private String description;
    private LocalDate dueDate;
    private LocalTime dueTime;
    private Integer priority;
    private List<String> tags;

    Task(Builder builder) {
        this.id = builder.id;
        this.title = builder.title;
        this.description = builder.description;
        this.dueDate = builder.dueDate;
        this.dueTime = builder.dueTime;
        this.priority = builder.priority;
        this.tags = builder.tags;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalTime getDueTime() {
        return dueTime;
    }

    public void setDueTime(LocalTime dueTime) {
        this.dueTime = dueTime;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", dueDate=" + dueDate +
                ", dueTime=" + dueTime +
                ", priority=" + priority +
                ", tags=" + tags +
                '}';
    }

    public static class Builder {
        private String id;
        private String title;
        private String description;
        private LocalDate dueDate;
        private LocalTime dueTime;
        private Integer priority;
        private List<String> tags;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setDueDate(LocalDate dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        public Builder setDueTime(LocalTime dueTime) {
            this.dueTime = dueTime;
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }

        public Builder setTags(List<String> tags) {
            this.tags = tags;
            return this;
        }

        public Task build() {
            return new Task(this);
        }
    }
}
