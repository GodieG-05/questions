package com.questions.app_questions.persistence.entity;

import java.sql.Timestamp;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity  
@Table(name = "surveys")  
public class Survey {  
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;  
    
    @Column(name = "create_At")
    private Timestamp createAt;  

    @Column(name = "updated_At")
    private Timestamp updatedAt;  

    private String description;  
    private String name;

    @OneToMany(mappedBy = "survey", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Chapter> chapters;
 
    public Set<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(Set<Chapter> chapters) {
        this.chapters = chapters;
    }

    public Survey() {
    }

    public Long getId() {  
        return id;  
    }  

    public void setId(Long id) {  
        this.id = id;  
    }  

    public Timestamp getCreateAt() {  
        return createAt;  
    }  

    public void setCreateAt(Timestamp createAt) {  
        this.createAt = createAt;  
    }  

    public Timestamp getUpdatedAt() {  
        return updatedAt;  
    }  

    public void setUpdatedAt(Timestamp updatedAt) {  
        this.updatedAt = updatedAt;  
    }  

    public String getDesription() {  
        return description;  
    }  

    public void setDescription(String description) {  
        this.description = description;  
    }  

    public String getName() {  
        return name;  
    }  

    public void setName(String name) {  
        this.name = name;  
    }

    @Override
    public String toString() {
        return "Survey [id=" + id + ", createAt=" + createAt + ", updatedAt=" + updatedAt + ", description="
                + description + ", name=" + name + ", chapters=" + chapters + "]";
    }  


} 
