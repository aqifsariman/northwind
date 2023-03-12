package ibf2022.paf.northwind.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ibf2022.paf.northwind.models.Customer;
import ibf2022.paf.northwind.models.Order;
import ibf2022.paf.northwind.services.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    CustomerService customerSVC;

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerSVC.getAllCustomers();
    }

    @GetMapping("/{id}")
    public Customer getCustomerByID(@PathVariable("id") Integer id) {
        return customerSVC.getCustomerByID(id);
    }

    @GetMapping("/{id}/orders")
    public List<Order> getOrdersByID(@PathVariable("id") Integer id) {
        return customerSVC.getOrderByID(id);
    }
}
