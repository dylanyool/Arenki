package com.arenki.entity;

import java.util.List;
import java.util.Optional;

public class ToDo {
    //------------------- VARIABLES -------------------------------------//
    boolean important;
    boolean urgent;
    String name;
    String detail="";
    List<Step> steps=null;
    //-------------------- CONSTRUCTORS ---------------------------------//

    public ToDo() {
        this.important=false;
        this.urgent=false;
    }

    public ToDo(boolean important, boolean urgent, String name, String detail) {
        this.important = important;
        this.urgent = urgent;
        this.name = name;
        this.detail = detail;
    }

    //---------------------GETTERS AND SETTERS -------------------------//
    public boolean isImportant() {
        return important;
    }

    public void setImportant(boolean important) {
        this.important = important;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

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

    public Optional<List<Step>> getSteps() {
        return Optional.ofNullable(steps);
    }

    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }
}
