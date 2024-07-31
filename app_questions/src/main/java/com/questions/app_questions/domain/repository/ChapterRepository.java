package com.questions.app_questions.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.questions.app_questions.persistence.entity.Chapter;

public interface ChapterRepository extends CrudRepository<Chapter,Long> {

}
