package com.example.renewal.service.test.psyTest.impl;

import com.example.renewal.models.entity.test.PsychologicalTest;
import com.example.renewal.repo.test.PsychologicalTestRepository;
import com.example.renewal.service.test.psyTest.inter.PsychologicalTestServiceInter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class PsychologicalTestServiceImpl implements PsychologicalTestServiceInter {
    private final PsychologicalTestRepository psychologicalTestRepository;
    @Override
    public PsychologicalTest createPsyTest(PsychologicalTest psyTest) {
       return psychologicalTestRepository.save(psyTest);
    }

    @Override
    public PsychologicalTest getTestById(Long id) {
       return psychologicalTestRepository.findById(id).orElseThrow(()-> new RuntimeException("test not found "));
    }

    @Override
    public List<PsychologicalTest> getAllPsyTests() {
        return psychologicalTestRepository.findAll();
    }

    @Override
    public void deletePsyTestById(Long id) {
   psychologicalTestRepository.deleteById(id);
    }
}
