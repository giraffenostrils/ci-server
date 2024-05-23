package com.example.smpoject.controller;

import com.example.smpoject.domain.Smploject;
import com.example.smpoject.dto.request.SmRequest;
import com.example.smpoject.dto.response.SmResponse;
import com.example.smpoject.service.SmService;
import com.example.smpoject.service.SmServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.BDDAssumptions.given;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.willDoNothing;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.web.servlet.function.RequestPredicates.contentType;

@WebMvcTest(SmController.class)
class SmControllerTest {
    @MockBean
    private SmServiceImpl smService;
    @Autowired
    private MockMvc mockMvc;

    @Test
    void save() throws Exception {


    }


    @Test
    void show() throws Exception {

        // given
        String name = "aa";

        // when & then
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/sm/{wwww}", name))
                .andExpect(status().isOk())// name 값을 확인// 예시 검증
                .andExpect(jsonPath("$.size()").value(0))
                .andDo(MockMvcResultHandlers.print());
    }


}