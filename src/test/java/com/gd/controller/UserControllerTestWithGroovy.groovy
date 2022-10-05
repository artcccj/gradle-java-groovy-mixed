package com.gd.controller

import com.gd.GradleDemoApplicationTests
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

class UserControllerTestWithGroovy extends GradleDemoApplicationTests {

    @Test
    void getUserNameById() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.get("/api/user/getUserNameById")
                .param("userId", "1232"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo({
                    def result = it.getResponse().getContentAsString()
                    Assertions.assertThat(result).endsWith("1232")
                });

    }
}
