package com.example.apptest.controllers;

import com.example.apptest.entities.Product;
import com.example.apptest.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/produit")
public class ProductController {

    @Autowired
    @Qualifier("productRepository")
    ProductRepository productRepository;

    @GetMapping("/list")
    //@ResponseBody
    public String listProducts(Model model) {
    	List<Product> lp = (List<Product>) productRepository.findAll();
    	if(lp.size()==0) lp = null;
        model.addAttribute("providers", lp);
        return "product/listProducts";
    }
}
