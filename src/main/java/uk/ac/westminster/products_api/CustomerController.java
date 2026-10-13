package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.*;
import uk.ac.westminster.products_api.Customer;
import uk.ac.westminster.products_api.Product;


@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("{id}")
    public Customer getById(@PathVariable long id) {
        Address address = new Address(
                "115 New Cavendish Street", "London", "W1W GUW");

        return new Customer(id,"Ada Lovelace", "ada@example.com", address);
    }
}
