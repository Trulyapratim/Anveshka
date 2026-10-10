package com.anveshka.backend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.LocalDate;

@Entity
public class Goal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Goal title cannot be empty")
    @Size(max = 100, message = "Goal title cannot exceed 100 characters")
    private String title;
    private String description;

    private Integer availableTime;

    @Enumerated(EnumType.STRING)
    private AvailableTimeUnit availableTimeUnit;

    private java.time.LocalDate startDate;
    private java.time.LocalDate originalDeadline;
    private java.time.LocalDate currentDeadline;

    @Enumerated(EnumType.STRING)
    private Difficulty difficulty;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Integer getAvailableTime() {
        return availableTime;
    }

    public void setAvailableTime(Integer availableTime) {
        this.availableTime = availableTime;
    }

    public AvailableTimeUnit getAvailableTimeUnit() {
        return availableTimeUnit;
    }

    public void setAvailableTimeUnit(AvailableTimeUnit availableTimeUnit) {
        this.availableTimeUnit = availableTimeUnit;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getOriginalDeadline() {
        return originalDeadline;
    }

    public void setOriginalDeadline(LocalDate originalDeadline) {
        this.originalDeadline = originalDeadline;
    }

    public LocalDate getCurrentDeadline() {
        return currentDeadline;
    }

    public void setCurrentDeadline(LocalDate currentDeadline) {
        this.currentDeadline = currentDeadline;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }
}
