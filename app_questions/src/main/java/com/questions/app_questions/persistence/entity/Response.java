package com.questions.app_questions.persistence.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table; 
import java.time.LocalDateTime;  

@Entity  
@Table(name = "responses")  
public class Response {  
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;  

    private Long responseTime;  

    private LocalDateTime responseDate;  

    @ManyToOne  
    @JoinColumn(name = "survey_id")  
    private Survey survey;  

    private String nameRespondent;  


    
    public Response() {
    }

    public Long getId() {  
        return id;  
    }  

    public void setId(Long id) {  
        this.id = id;  
    }  

    public Long getResponseTime() {  
        return responseTime;  
    }  

    public void setResponseTime(Long responseTime) {  
        this.responseTime = responseTime;  
    }  

    public LocalDateTime getResponseDate() {  
        return responseDate;  
    }  

    public void setResponseDate(LocalDateTime responseDate) {  
        this.responseDate = responseDate;  
    }  

    public Survey getSurvey() {  
        return survey;  
    }  

    public void setSurvey(Survey survey) {  
        this.survey = survey;  
    }  

    public String getNameRespondent() {  
        return nameRespondent;  
    }  

    public void setNameRespondent(String nameRespondent) {  
        this.nameRespondent = nameRespondent;  
    }  

    @Override  
    public String toString() {  
        return "Response{" +  
            "id=" + id +  
            ", responseTime=" + responseTime +  
            ", responseDate=" + responseDate +  
            ", survey=" + survey +  
            ", nameRespondent='" + nameRespondent + '\'' +  
            '}';  
    }  
}
