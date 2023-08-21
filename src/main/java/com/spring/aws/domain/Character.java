package com.spring.aws.domain;


public class Character {

    private Long id;
    private String name;
    private Long healthPoints;
    private String[] skills;

    public Character() {

    }
    public Character(Long id, String name, Long healthPoints, String[] skills) {
        this.id = id;
        this.name = name;
        this.healthPoints = healthPoints;
        this.skills = skills;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(Long healthPoints) {
        this.healthPoints = healthPoints;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }
}