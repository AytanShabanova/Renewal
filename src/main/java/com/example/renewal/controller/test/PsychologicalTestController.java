package com.example.renewal.controller.test;

import com.example.renewal.models.entity.test.PsychologicalTest;
import com.example.renewal.service.test.psyTest.inter.PsychologicalTestServiceInter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/psychological-tests")
@RequiredArgsConstructor
public class PsychologicalTestController {
    private final PsychologicalTestServiceInter psyTestServiceInter;
    @PostMapping
    public ResponseEntity<PsychologicalTest>createTest(@RequestBody PsychologicalTest psychologicalTest) {
        return ResponseEntity.ok(psyTestServiceInter.createPsyTest(psychologicalTest));
    }
    @GetMapping("/{id}")
    public ResponseEntity<PsychologicalTest>getTestById(@PathVariable long id) {
        return ResponseEntity.ok(psyTestServiceInter.getTestById(id));
    }
    @GetMapping
    public ResponseEntity<List<PsychologicalTest>> getAllTests() {
        return ResponseEntity.ok(psyTestServiceInter.getAllPsyTests());
    }
    @DeleteMapping
    public ResponseEntity<Void> deleteTestById(@RequestParam long id) {
        psyTestServiceInter.deletePsyTestById(id);
        return ResponseEntity.noContent().build();

    }
}
