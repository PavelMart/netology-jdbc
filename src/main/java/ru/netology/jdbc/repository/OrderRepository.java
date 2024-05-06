package ru.netology.jdbc.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ru.netology.jdbc.entity.OrderEntity;

import java.util.List;

@Repository
public class OrderRepository {

    @PersistenceContext
    private EntityManager em;

    public List<OrderEntity> getOrdersByCustomerName(String name) {
        String query = "select o from OrderEntity o join o.customerEntity c where lower(c.name) = :name";

        return em.createQuery(query, OrderEntity.class)
                .setParameter("name", name)
                .getResultList();
    }
}
