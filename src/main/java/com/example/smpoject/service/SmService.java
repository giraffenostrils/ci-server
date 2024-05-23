package com.example.smpoject.service;

import com.example.smpoject.domain.Smploject;
import com.example.smpoject.dto.request.SmRequest;

import java.util.List;
import java.util.Optional;

public interface SmService {

    void save(SmRequest smRequest);
    List<Smploject> shows(String name);
    Optional<Smploject> findById(Long id);
    void deleteById(Long id);

}
