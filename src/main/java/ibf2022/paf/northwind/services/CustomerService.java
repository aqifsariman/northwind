package ibf2022.paf.northwind.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibf2022.paf.northwind.models.Customer;
import ibf2022.paf.northwind.models.Order;
import ibf2022.paf.northwind.repositories.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepo;

    public List<Customer> getAllCustomers() {
        return customerRepo.getAllCustomers();
    }

    public Customer getCustomerByID(Integer id) {
        return customerRepo.getCustomerByID(id);
    }

    public List<Order> getOrderByID(Integer id) {
        return customerRepo.getOrdersByID(id);
    }

}
