package com.questions.app_questions.persistence.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity  
@Table(name = "questions")  
public class Question {  
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;  

    @ManyToOne  
    @JoinColumn(name = "chapter_id")  
    private Chapter chapterId;  

    @ManyToOne  
    @JoinColumn(name = "parent_question_id")  
    private Question parentQuestionId;  

    @ManyToOne  
    @JoinColumn(name = "survey_id")  
    private Survey surveyId;  

    private String questionNumber;  

    private String questionText;  

    private String responseType;  

    private String commentQuestion;  


    
    public Question() {
    }

    public Long getId() {  
        return id;  
    }  

    public void setId(Long id) {  
        this.id = id;  
    }  

    public Chapter getChapterId() {  
        return chapterId;  
    }  

    public void setChapterId(Chapter chapterId) {  
        this.chapterId = chapterId;  
    }  

    public Question getParentQuestionId() {  
        return parentQuestionId;  
    }  

    public void setParentQuestionId(Question parentQuestionId) {  
        this.parentQuestionId = parentQuestionId;  
    }  

    public Survey getSurveyId() {  
        return surveyId;  
    }  

    public void setSurveyId(Survey surveyId) {  
        this.surveyId = surveyId;  
    }  

    public String getQuestionNumber() {  
        return questionNumber;  
    }  

    public void setQuestionNumber(String questionNumber) {  
        this.questionNumber = questionNumber;  
    }  

    public String getQuestionText() {  
        return questionText;  
    }  

    public void setQuestionText(String questionText) {  
        this.questionText = questionText;  
    }  

    public String getResponseType() {  
        return responseType;  
    }  

    public void setResponseType(String responseType) {  
        this.responseType = responseType;  
    }  

    public String getCommentQuestion() {  
        return commentQuestion;  
    }  

    public void setCommentQuestion(String commentQuestion) {  
        this.commentQuestion = commentQuestion;  
    }  

    @Override  
    public String toString() {  
        return "{" +  
            "id=" + id +  
            ", chapter=" + chapterId +  
            ", parentQuestion=" + parentQuestionId +  
            ", survey=" + surveyId +  
            ", questionNumber=" + questionNumber +  
            ", questionText='" + questionText + '\'' +  
            ", responseType='" + responseType + '\'' +  
            ", commentQuestion='" + commentQuestion + '\'' +  
            '}';  
    }  
}
