package com.questions.app_questions.domain.service;

import java.util.List;
import java.util.Optional;

import com.questions.app_questions.persistence.entity.ResponseCatalog;

public interface ResponseCatalogService {
    List<ResponseCatalog> findAll();
    Optional<ResponseCatalog> findById(Long id);
    ResponseCatalog save(ResponseCatalog responseCatalog);
    ResponseCatalog update(Long id);
    Optional<ResponseCatalog> delete(Long id);
}
