package com.questions.app_questions.domain.service.DetailResponse;

import java.util.List;
import java.util.Optional;

import com.questions.app_questions.persistence.entity.DetailResponse;

public interface DetailResponseService {
    List<DetailResponse> findAll();
    Optional<DetailResponse> findById(Long id);
    DetailResponse save(DetailResponse detailResponse);
    Optional<DetailResponse> update(Long id, DetailResponse detailResponse);
    Optional<DetailResponse> delete(Long id);
}
