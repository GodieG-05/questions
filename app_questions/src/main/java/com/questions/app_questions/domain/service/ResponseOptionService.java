package com.questions.app_questions.domain.service;

import java.util.List;
import java.util.Optional;

import com.questions.app_questions.persistence.entity.ResponseOption;

public interface ResponseOptionService {
    List<ResponseOption> findAll();
    Optional<ResponseOption> findById(Long id);
    ResponseOption save(ResponseOption responseOption);
    ResponseOption update(Long id);
    Optional<ResponseOption> delete(Long id);
}