package com.simon.Assignment1;

import java.beans.JavaBean;

public class Person {

    private String name;
    private int age;
    private Address address;

    public Person() {

    }

    public Person(String name, int age, Address address) {

        this.name = name;
        this.age  = age;
        this.address = address;
    }

    public String getName() {

        return this.name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return this.age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    // 5.Skriv en metod isOlderThan() i klassen Person som jämför två personer
    public boolean isOlderThan(Person person) {

        return this.age > person.getAge();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
