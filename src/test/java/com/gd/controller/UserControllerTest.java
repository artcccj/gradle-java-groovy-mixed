package com.gd.controller;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.gd.GradleDemoApplicationTests;

class UserControllerTest extends GradleDemoApplicationTests {

  @Test
  void getUserNameById() throws Exception {

    mockMvc.perform(MockMvcRequestBuilders.get("/api/user/getUserNameById")
            .param("userId", "1232"))
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andDo(result -> result.getResponse().getContentAsString().endsWith("1232"));

  }

}