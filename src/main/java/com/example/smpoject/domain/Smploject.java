package com.example.smpoject.domain;

import jakarta.persistence.*;
import lombok.*;
//git
@Getter
@Builder
@Table(name = "SMPROJECT")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Smploject {
//
    @GeneratedValue(strategy =GenerationType.AUTO)
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "TEXT")
    private String text;


}
