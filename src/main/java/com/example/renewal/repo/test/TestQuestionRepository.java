package com.example.renewal.repo.test;

import com.example.renewal.models.entity.test.TestQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestQuestionRepository extends JpaRepository<TestQuestion,Long> {

}
