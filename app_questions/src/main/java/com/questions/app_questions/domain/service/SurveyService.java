package com.questions.app_questions.domain.service;

import java.util.List;
import java.util.Optional;

import com.questions.app_questions.persistence.entity.Survey;

public interface SurveyService {
    List<Survey> findAll();
    Optional<Survey> findById(Long id);
    Survey save(Survey survey);
    Survey update(Long id);
    Optional<Survey> delete(Long id);
}
