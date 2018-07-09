package com.kenny.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Student {

    private UUID id;
    private final Integer age;
    private final String firstName;
    private final String lastName;
    private final String project;

//Tell Jackson to create an instance of the Student below by using some special annotati
    public Student(

            @JsonProperty("id")   UUID id,
            @JsonProperty("age")  Integer age,
            @JsonProperty("firstName") String firstName,
            @JsonProperty("lastName")  String lastName,
            @JsonProperty("project") String project) {
        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.project = project;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getProject() {
        return project;
    }
}
