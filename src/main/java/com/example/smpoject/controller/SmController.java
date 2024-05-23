package com.example.smpoject.controller;

import com.example.smpoject.domain.Smploject;
import com.example.smpoject.dto.request.SmRequest;
import com.example.smpoject.dto.response.SmResponse;
import com.example.smpoject.service.SmService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/sm")
@CrossOrigin(
        allowedHeaders = "*",
        origins ="*",
        methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE}
)
public class SmController {

    private final SmService service;

    @PostMapping
    ResponseEntity<SmResponse> save(@RequestBody SmRequest smRequest){
        service.save(smRequest);
        SmResponse smResponse = null;
        return ResponseEntity.ok(smResponse);
    }
//
    //
    //
    @GetMapping("/{name}")
    List<Smploject> show(@PathVariable("name")String name){

        List<Smploject> shows = service.shows(name);

        return shows;
    }
}
