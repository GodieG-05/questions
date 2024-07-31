package com.questions.app_questions.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.questions.app_questions.persistence.entity.ResponseCatalog;

public interface ResponseCatalogRepository extends CrudRepository<ResponseCatalog,Long>{

}
