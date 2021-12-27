package com.malves.domain.entitiesDto;

import com.malves.domain.entities.Person;

public class PersonDto {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person toPerson() {
        return new Person(name, age);
    }
}
