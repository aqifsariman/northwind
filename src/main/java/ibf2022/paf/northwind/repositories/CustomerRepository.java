package ibf2022.paf.northwind.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ibf2022.paf.northwind.models.Customer;
import ibf2022.paf.northwind.models.Order;

@Repository
public class CustomerRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    private final String getAllSQL = "SELECT * FROM CUSTOMERS";
    private final String getByIDSQL = "SELECT * FROM CUSTOMERS WHERE id = ?";
    private final String getOrdersByIDSQL = "SELECT * FROM ORDERS WHERE customer_id = ?";

    public List<Customer> getAllCustomers() {
        return jdbcTemplate.query(getAllSQL, BeanPropertyRowMapper.newInstance(Customer.class));
    }

    public Customer getCustomerByID(Integer id) {
        return jdbcTemplate.queryForObject(getByIDSQL, BeanPropertyRowMapper.newInstance(Customer.class), id);
    }

    public List<Order> getOrdersByID(Integer id) {
        return jdbcTemplate.query(getOrdersByIDSQL, BeanPropertyRowMapper.newInstance(Order.class), id);
    }
}
