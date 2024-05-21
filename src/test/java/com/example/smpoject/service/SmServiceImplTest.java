package com.example.smpoject.service;

import com.example.smpoject.domain.SmRepository;
import com.example.smpoject.domain.Smploject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
class SmServiceImplTest {

    @Mock
    private SmRepository smRepository;
    @InjectMocks
    private SmServiceImpl smService;

    @Test
    void save() {
        Smploject smploject = new Smploject(1l, "test", "test");
        BDDMockito.given(smRepository.findById(1l))
                .willReturn(Optional.of(smploject));


        Optional<Smploject> byId = smService.findById(1l);

//        행위 검증
        Mockito.verify(smRepository, Mockito.times(1)).findById(1l);
//        상태 검증
        assertEquals("test", byId.get().getName());
        assertEquals("test", byId.get().getText());
        assertNotNull(byId.get().getId());
        
    }
    @Test
    void findByIdNotExist(){
        Smploject smploject = new Smploject(1l, "test", "test");
        BDDMockito.given(smRepository.findById(1l))
                .willReturn(Optional.empty());
        assertThrows(IllegalArgumentException.class, ()->{
            smService.findById(1l);
        });
        Mockito.verify(smRepository,Mockito.times(1)).findById(1l);
    }

    @Test
    void shows() {
    }

    @Test
    void findById() {
    }
}