package ru.netology.jdbc.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Check;

@Entity
@Table(schema = "jdbc_test", name = "customers")
public class CustomerEntity {
    @Id
    @GeneratedValue
    int id;
    @Column(length = 50)
    String name;
    @Column(length = 50)
    String surname;
    @Column
    @Check(constraints = "age > 0")
    int age;
    @Column(unique = true, length = 10)
    String phone_number;

    public CustomerEntity() {}

    public CustomerEntity(int id, String name, String surname, int age, String phone_number) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phone_number = phone_number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
