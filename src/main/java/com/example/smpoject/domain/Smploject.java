package com.example.smpoject.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

//git
@Getter
@Builder
@Table(name = "SMPROJECT")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Smploject {

    @GeneratedValue(strategy =GenerationType.AUTO)
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "TEXT")
    private String text;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smploject smploject = (Smploject) o;
        return Objects.equals(id, smploject.id) && Objects.equals(name, smploject.name) && Objects.equals(text, smploject.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, text);
    }
}
