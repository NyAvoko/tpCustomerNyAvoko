/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nyavoko.tp1denyavoko.service;

import com.nyavoko.tp1denyavoko.entity.Customer;
import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import java.util.List;

/**
 *
 * @author Avoko
 *  * Gère la persistance des Customers.
 */
@RequestScoped
public class CustomerManager {

    @PersistenceContext(unitName = "customerPU")
    private EntityManager em;

    public List<Customer> getAllCustomers() {
        Query query = em.createNamedQuery("Customer.findAll");
        return query.getResultList();
    }

    @Transactional
    public Customer update(Customer customer) {
        return null;
    }

    @Transactional
    public void persist(Customer customer) {
        em.persist(customer);
    }

    public Customer findById(int idCustomer) {
    return em.find(Customer.class, idCustomer);
    }
}
