package com.qa.animals.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
class Animals {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    private String animalGroup;

    private Double size;

    private Double weight;

    private Integer noOfLegs;

    private String diet;


    //Generating Constructors
    public Animals() {
    }

    public Animals(Long id, String name, String animalGroup, Double size, Double weight, Integer noOfLegs, String diet) {
        this.id = id;
        this.name = name;
        this.animalGroup = animalGroup;
        this.size = size;
        this.weight = weight;
        this.noOfLegs = noOfLegs;
        this.diet = diet;
    }

    public Animals(String name, String animalGroup, Double size, Double weight, Integer noOfLegs, String diet) {
        this.name = name;
        this.animalGroup = animalGroup;
        this.size = size;
        this.weight = weight;
        this.noOfLegs = noOfLegs;
        this.diet = diet;
    }

    //Getters and Setters

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

    public String getAnimalGroup() {
        return animalGroup;
    }

    public void setAnimalGroup(String animalGroup) {
        this.animalGroup = animalGroup;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(Integer noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }
}
