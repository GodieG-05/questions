package com.questions.app_questions.domain.service;

import java.util.List;
import java.util.Optional;

import com.questions.app_questions.persistence.entity.Response;

public interface ResponseService {
    List<Response> findAll();
    Optional<Response> findById(Long id);
    Response save(Response response);
    Response update(Long id);
    Optional<Response> delete(Long id);
}