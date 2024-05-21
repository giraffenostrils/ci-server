package com.example.smpoject.service;

import com.example.smpoject.domain.SmRepository;
import com.example.smpoject.domain.Smploject;
import com.example.smpoject.dto.request.SmRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class SmServiceImpl implements SmService{

    private final SmRepository smRepository;


    @Override
    public void save(SmRequest smRequest) {

        Smploject smploject = Smploject.builder()
                .text(smRequest.text())
                .name(smRequest.name())
                .build();

        System.out.println(smploject);

        smRepository.save(smploject);
    }

    @Override
    public List<Smploject> shows(String name) {

        List<Smploject> byNames = smRepository.findByName(name);

        return byNames;
    }

    @Override
    public Optional<Smploject> findById(Long id) {

        Optional<Smploject> byId = smRepository.findById(id);
        if(byId.isEmpty())throw new IllegalArgumentException("못찾음");


        return byId;
    }

    @Override
    public void deleteById(Long id) {


        Optional<Smploject> byId = smRepository.findById(id);
        if(byId.isEmpty())throw new IllegalArgumentException("못찾음");

        smRepository.deleteById(id);

    }
}
