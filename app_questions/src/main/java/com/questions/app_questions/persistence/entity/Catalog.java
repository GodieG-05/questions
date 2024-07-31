package com.questions.app_questions.persistence.entity;


import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity  
@Table(name = "catalogs")  
public class Catalog {  
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;  

    private String name;  

    @OneToMany(mappedBy = "catalog", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ResponseCatalog> responseCatalogs;

    public Catalog() {
    }

    public Set<ResponseCatalog> getResponseCatalogs() {
        return responseCatalogs;
    }

    public void setResponseCatalogs(Set<ResponseCatalog> responseCatalogs) {
        this.responseCatalogs = responseCatalogs;
    }

    public Long getId() {  
        return id;  
    }  

    public void setId(Long id) {  
        this.id = id;  
    }  

    public String getName() {  
        return name;  
    }  

    public void setName(String name) {  
        this.name = name;  
    }  

    @Override  
    public String toString() {  
        return "Catalog{" +  
            "id=" + id +  
            ", name='" + name + '\'' +  
            '}';  
    }  
}  
