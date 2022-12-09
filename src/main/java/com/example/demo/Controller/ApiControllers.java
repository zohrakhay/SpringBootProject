package com.example.demo.Controller;

import com.example.demo.Models.Product;
import com.example.demo.Repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiControllers {
    @Autowired
    private ProductRepo productRepo;
    @GetMapping(value = "/")
    public String getPage()
    {
        return "Welcome";
    }

    @GetMapping(value = "/products")
    public List<Product> getUsers(){
        return productRepo.findAll();
    }

    @PostMapping(value = "/save")
    public String saveUser(Product user)
    {
        productRepo.save(user);
        return "product saved";
    }

    

    @DeleteMapping(value = "/delete/{id}")
    public String deleteProduct(@PathVariable long id)
    {
        Product deleteProduct = productRepo.findById(id).get();
        productRepo.delete(deleteProduct);
        return "Product deleted with id: "+id;
    }
}
