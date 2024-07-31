package com.questions.app_questions.domain.service.DetailResponse;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.questions.app_questions.domain.repository.DetailResponseRepository;
import com.questions.app_questions.persistence.entity.DetailResponse;

@Service
public class DetailResponseImpl implements DetailResponseService {
    
    @Autowired
    private DetailResponseRepository repository;

    @Transactional
    @Override
    public List<DetailResponse> findAll() {
        return (List<DetailResponse>) repository.findAll();
    }

    @Transactional
    @Override
    public Optional<DetailResponse> findById(Long id) {
        return repository.findById(id);
    }

    @Transactional
    @Override
    public DetailResponse save(DetailResponse detailResponse) {
        return repository.save(detailResponse);
    }

    @Transactional
    @Override
    public Optional<DetailResponse> delete(Long id) {
        Optional<DetailResponse> detailResponseOpt = repository.findById(id);
        detailResponseOpt.ifPresent(detailResponseItem ->{
            repository.delete(detailResponseItem);
        });
        return detailResponseOpt;
    }

    @Transactional
    @Override
    public Optional<DetailResponse> update(Long id, DetailResponse detailResponse){
        Optional<DetailResponse> optionalDetailResponse = repository.findById(id);
        if(optionalDetailResponse.isPresent()){
            DetailResponse detailResponseItem = optionalDetailResponse.orElseThrow();
            detailResponseItem.setResponseOption(detailResponse.getResponseOption());
            detailResponseItem.setQuestion(detailResponse.getQuestion());
            detailResponseItem.setResponse(detailResponse.getResponse());
            detailResponseItem.setResponseText(detailResponse.getResponseText());
            return Optional.of(repository.save(detailResponseItem));
        }
        return optionalDetailResponse;
    }
}
