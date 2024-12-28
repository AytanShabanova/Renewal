package com.example.renewal.models.entity.test;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TestQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String questionText;
    @ManyToOne
            @JoinColumn(name = "test_id")
    PsychologicalTest test;
}
