package com.questions.app_questions.domain.service.Catalog;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.questions.app_questions.domain.repository.CatalogRepository;
import com.questions.app_questions.persistence.entity.Catalog;

@Service
public class CatalogImpl implements CatalogService {

    @Autowired
    private CatalogRepository repository;

    @Transactional
    @Override
    public List<Catalog> findAll() {
        return (List<Catalog>) repository.findAll();
    }

    @Transactional
    @Override
    public Optional<Catalog> findById(Long id) {
        return repository.findById(id);
    }

    @Transactional
    @Override
    public Catalog save(Catalog catalog) {
        return repository.save(catalog);
    }

    @Transactional
    @Override
    public Optional<Catalog> delete(Long id) {
        Optional<Catalog> catalogOpt = repository.findById(id);
        catalogOpt.ifPresent(catalogItem -> {
            repository.delete(catalogItem);
        });
        return catalogOpt;
    }

    @Override
    public Optional<Catalog> update(Long id, Catalog catalog) {
        Optional<Catalog> catalogOpt = repository.findById(id);
        if (catalogOpt.isPresent()) {
            Catalog catalogItem = catalogOpt.orElseThrow();
            catalogItem.setName(catalog.getName());
            catalogItem.setResponseCatalogs(catalog.getResponseCatalogs());
            return Optional.of(repository.save(catalogItem));
        }
        return catalogOpt;
    }
}
