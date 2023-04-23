package com.webrest.api.restapi.model;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

import lombok.Data;


@Data
@Entity
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserModel userModel = (UserModel) o;
        return Objects.equals(id, userModel.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public UserModel addId(Long id)  {
        this.id = id;
        return this;
    }

    public UserModel addName(String name) {
        this.name = name;
        return this;
    }

    public UserModel addAge(int age) {
        this.age = age;
        return this;
    }

    public int getAge() {
        return this.age;
    }

}
