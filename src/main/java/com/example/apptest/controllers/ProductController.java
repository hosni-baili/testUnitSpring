//package com.example.apptest.controllers;
//
//import com.example.apptest.repository.ProductRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class ProductController {
//
//    @Autowired
//    @Qualifier("productRepository")
//    ProductRepository productRepository;
//
//    @GetMapping("/list")
//    //@ResponseBody
//    public String listProducts(Model model) {
////    	List<Provider> lp = (List<Provider>) providerRepository.findAll();
////    	if(lp.size()==0) lp = null;
//        model.addAttribute("providers", null);
//        return "provider/listProviders";
//    }
//}
