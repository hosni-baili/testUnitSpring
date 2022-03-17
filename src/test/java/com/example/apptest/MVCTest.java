package com.example.apptest;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

//@WebMvcTest
public class MVCTest extends AppTestApplicationTests{

    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @Before()
    public void setup() {

        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void Test1_home() throws Exception {
        this.mockMvc.perform(get("/produit/list/"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("hosni")));
    }

//    @Test
//    public void Test2_home() throws Exception {
//        this.mockMvc.perform(get("/list"))
//                .andExpect(status().isOk())
//                .andExpect(content().string(containsString("provider")));
//    }
//
//    @Test
//    public void Test3_home() throws Exception {
//        this.mockMvc.perform(get("/list"))
//                .andExpect(status().isOk())
//                .andExpect(content().string(containsString("products")));
//    }

}
