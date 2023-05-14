package com.example.demo.BankAccountSystem.Repository;

import com.example.demo.BankAccountSystem.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    @Query(value = "SELECT c from Customer c where c.customerId = :customerId")          //get Customer By Id
    Customer getCustomerById(Integer customerId);
}
