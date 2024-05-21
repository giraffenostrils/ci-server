package com.example.smpoject.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SmRepository extends JpaRepository<Smploject,Long> {
    List<Smploject> findByName(String name);
}
