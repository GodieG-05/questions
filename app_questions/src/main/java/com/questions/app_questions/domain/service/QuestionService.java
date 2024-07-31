package com.questions.app_questions.domain.service;

import java.util.List;
import java.util.Optional;

import com.questions.app_questions.persistence.entity.Question;

public interface QuestionService {
    List<Question> findAll();
    Optional<Question> findById(Long id);
    Question save(Question question);
    Question update(Long id);
    Optional<Question> delete(Long id);
}
