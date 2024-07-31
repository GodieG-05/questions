package com.questions.app_questions.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.questions.app_questions.persistence.entity.Catalog;

public interface CatalogRepository extends CrudRepository<Catalog,Long>{

}
