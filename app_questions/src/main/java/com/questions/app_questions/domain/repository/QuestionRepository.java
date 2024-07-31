package com.questions.app_questions.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.questions.app_questions.persistence.entity.Question;

public interface QuestionRepository extends CrudRepository<Question,Long>{

}
