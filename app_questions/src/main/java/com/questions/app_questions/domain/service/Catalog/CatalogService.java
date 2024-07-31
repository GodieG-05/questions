package com.questions.app_questions.domain.service.Catalog;

import java.util.List;
import java.util.Optional;

import com.questions.app_questions.persistence.entity.Catalog;

public interface CatalogService {
    List<Catalog> findAll();
    Optional<Catalog> findById(Long id);
    Catalog save(Catalog catalog);
    Optional<Catalog> update(Long id, Catalog catalog);
    Optional<Catalog> delete(Long id);
}
