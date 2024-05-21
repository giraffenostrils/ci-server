package com.example.smpoject.controller;

import com.example.smpoject.domain.Smploject;
import com.example.smpoject.dto.request.SmRequest;
import com.example.smpoject.service.SmService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/sm")
public class SmController {

    private final SmService service;

    @PostMapping
    void save(@RequestBody SmRequest smRequest){
        service.save(smRequest);
    }

    @GetMapping
    List<Smploject> show(@PathVariable("id")String id){

        List<Smploject> shows = service.shows(id);

        return shows;
    }
}
