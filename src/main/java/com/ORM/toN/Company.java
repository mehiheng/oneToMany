package com.ORM.toN;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    @CreatedDate
    ZonedDateTime createdDate=ZonedDateTime.now();

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "company",fetch = FetchType.LAZY)
    private List<employee> employees=new ArrayList<>();

    public List<employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<employee> employees) {
        this.employees = employees;
    }

    public Company(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    public Company(){}

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

    public ZonedDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(ZonedDateTime createdDate) {
        this.createdDate = createdDate;
    }
}
