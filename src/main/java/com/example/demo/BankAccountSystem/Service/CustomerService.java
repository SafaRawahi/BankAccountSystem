package com.example.demo.BankAccountSystem.Service;

import com.example.demo.BankAccountSystem.Model.Customer;
import com.example.demo.BankAccountSystem.Repository.CustomerRepository;
import com.example.demo.BankAccountSystem.RequestObject.UpdateCustomerInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public void addCustomer(Customer customer) {
        Customer customerInfo = new Customer();
        customerInfo.setName(customer.getName());
        customerInfo.setAge(customer.getAge());
        customerInfo.setEmail(customer.getEmail());
        customerInfo.setPhoneNumber(customer.getPhoneNumber());
        customerInfo.setCreatedDate(customer.getCreatedDate());
        customerInfo.setUpdatedDate(customer.getUpdatedDate());
        customerInfo.setIsActive(customer.getIsActive());
        customerRepository.save(customerInfo);
    }

    //Update the customer information
        public void updateCustomer(UpdateCustomerInfo customer) {
            Customer customerInfo = new Customer();
            customerInfo.setCustomerId(customer.getId());
            customerInfo.setName(customer.getName());
            customerInfo.setEmail(customer.getEmail());
            customerInfo.setPhoneNumber(customer.getPhoneNumber());
            customerInfo.setIsActive(customer.getIsActive());
            customerInfo.setAge(customer.getAge());
            customerInfo.setCreatedDate(customer.getCreatedDate());
            customerInfo.setUpdatedDate(customer.getUpdatedDate());
            customerRepository.save(customerInfo);

        }
    }

