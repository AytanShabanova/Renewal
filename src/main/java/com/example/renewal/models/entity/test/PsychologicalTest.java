package com.example.renewal.models.entity.test;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PsychologicalTest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String title;
    @OneToMany(mappedBy = "test",fetch = FetchType.LAZY)
    List<TestQuestion> questions;
}
