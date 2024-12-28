package com.example.renewal.service.test.psyTest.inter;

import com.example.renewal.models.entity.test.PsychologicalTest;

import java.util.List;

public interface PsychologicalTestServiceInter {
    PsychologicalTest createPsyTest(PsychologicalTest psyTest);
    PsychologicalTest getTestById(Long id);
    List<PsychologicalTest> getAllPsyTests();
    void deletePsyTestById(Long id);

}
