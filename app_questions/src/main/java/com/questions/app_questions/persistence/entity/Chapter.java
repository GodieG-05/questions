package com.questions.app_questions.persistence.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity  
@Table(name = "chapter")  
public class Chapter {  
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;  

    @ManyToOne  
    @JoinColumn(name = "survey_id")  
    private Survey survey;  

    @Column(name = "chapter_number")
    private String chapterNumber;  

    @Column(name = "chapter_title")
    private String chapterTitle;  


    public Chapter() {
    }

    public Long getId() {  
        return id;  
    }  

    public void setId(Long id) {  
        this.id = id;  
    }  

    public Survey getSurvey() {  
        return survey;  
    }  

    public void setSurvey(Survey survey) {  
        this.survey = survey;  
    }  

    public String getChapterNumber() {  
        return chapterNumber;  
    }  

    public void setChapterNumber(String chapterNumber) {  
        this.chapterNumber = chapterNumber;  
    }

    public String getChapterTitle() {  
        return chapterTitle;  
    }  

    public void setChapterTitle(String chapterTitle) {  
        this.chapterTitle = chapterTitle;  
    }  

    @Override  
    public String toString() {  
        return "Chapter{" +  
            "id=" + id +  
            ", survey=" + survey +  
            ", chapterNumber='" + chapterNumber +
            ", chapterTitle='" + chapterTitle  +  
            '}';  
    }  
}
