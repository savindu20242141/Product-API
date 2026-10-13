package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.*;


@RestController
    @RequestMapping("/products")
    public class ProductController {

        @GetMapping("{id}")
        public Product getById(@PathVariable long id) {
            return new Product(id, "Laptop", 999.99);
        }
    }
