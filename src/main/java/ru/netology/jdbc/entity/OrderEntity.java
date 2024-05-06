package ru.netology.jdbc.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(schema = "jdbc_test", name = "orders")
public class OrderEntity {
    @Id
    @GeneratedValue
    int id;
    @Column
    Date date;
    @Column
    String productName;
    @Column
    int amount;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    CustomerEntity customerEntity;

    public OrderEntity() {}

    public OrderEntity(int id, Date date, String productName, int amount, CustomerEntity customerEntity) {
        this.id = id;
        this.date = date;
        this.productName = productName;
        this.amount = amount;
        this.customerEntity = customerEntity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public CustomerEntity getCustomerEntity() {
        return customerEntity;
    }

    public void setCustomerEntity(CustomerEntity customerEntity) {
        this.customerEntity = customerEntity;
    }
}
