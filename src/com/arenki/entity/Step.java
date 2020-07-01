package com.arenki.entity;

import java.util.Optional;

public class Step {
    //------------------- VARIABLES ----------------------///
    String name;
    String detail;

    //---------------- CONSTRUCTOR -------------------------//
    public Step(String name) {
        this.name = name;
    }

    public Step(String name, String detail) {
        this.name = name;
        this.detail = detail;
    }

    //----------------GETTERS AND SETTERS -------------------------//
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<String> getDetail() {
        return Optional.ofNullable(detail);
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
