package com.example.demo.BankAccountSystem.Controller;


import com.example.demo.BankAccountSystem.Model.Customer;
import com.example.demo.BankAccountSystem.RequestObject.UpdateCustomerInfo;
import com.example.demo.BankAccountSystem.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;


//    adding more customer
    @RequestMapping(value = "AddCustomer",method = RequestMethod.POST)
    public String addCustomer (@RequestBody Customer customer){
        try {
            customerService.addCustomer(customer);
            return "Customer added Successfully";
        }catch (Exception e){
            return "Customer added Failed";
        }
    }

    //Update the customer information
    @RequestMapping(value = "updateCustomer", method = RequestMethod.POST)
    public String updateCustomer(@RequestBody UpdateCustomerInfo updateCustomerInfo) {
        try {
            customerService.updateCustomer(updateCustomerInfo);
            return "Customer Updated Successfully";
        } catch (Exception e) {
            return "Customer Updated Failed";
        }
    }


}
