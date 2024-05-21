package com.example.smpoject.service;

import com.example.smpoject.domain.SmRepository;
import com.example.smpoject.domain.Smploject;
import com.example.smpoject.dto.request.SmRequest;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class SmServiceTest {

    @Autowired
    private SmServiceImpl smService;
    @Autowired
    private SmRepository smRepository;


    @Test
    void save() {
    //given
    SmRequest smRequest = new SmRequest("aa","textaa");
    //when &then
    smService.save(smRequest);


    }

    @Test
    void shows() {
    //given
        SmRequest smRequest = new SmRequest("aa","textaa");
        SmRequest smRequest1 = new SmRequest("aa","textbb");
    //when & then

        List<Smploject> shows = smService.shows(smRequest.name());

        for(Smploject findName : shows){

            assertEquals(findName.getName(),"aa");

        }

    }

    @Test
    void findById() {

        //given
        SmRequest smRequest = new SmRequest("aa","textaa");
        SmRequest smRequest1 = new SmRequest("bb","textbb");

        smService.save(smRequest);
        smService.save(smRequest1);


        //when
        Long id=0l;
        List<Smploject> shows = smService.shows(smRequest1.name());

        for(Smploject smploject:shows){

            id = smploject.getId();
        }


        Optional<Smploject> byId = smService.findById(id);

        //then
        assertEquals(byId.get().getName(),"bb");

    }
}