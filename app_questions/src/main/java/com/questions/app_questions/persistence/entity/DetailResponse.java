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
@Table(name = "detail_responses")  
public class DetailResponse {  
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;  

    @Column(name = "response_option")
    private Integer responseOption;

    @ManyToOne  
    @JoinColumn(name = "question_id")  
    private Question question;  

    @ManyToOne  
    @JoinColumn(name = "response_id")  
    private Response response;  

    @Column(name = "response_text")
    private String responseText;  

    
  
    public DetailResponse() {
    }



    public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
    }



    public Integer getResponseOption() {
        return responseOption;
    }



    public void setResponseOption(Integer responseOption) {
        this.responseOption = responseOption;
    }



    public Question getQuestion() {
        return question;
    }



    public void setQuestion(Question question) {
        this.question = question;
    }



    public Response getResponse() {
        return response;
    }



    public void setResponse(Response response) {
        this.response = response;
    }



    public String getResponseText() {
        return responseText;
    }



    public void setResponseText(String responseText) {
        this.responseText = responseText;
    }



    @Override
    public String toString() {
        return "DetailResponse [id=" + id + ", responseOption=" + responseOption + ", question=" + question
                + ", response=" + response + ", responseText=" + responseText + "]";
    }

    

    
}
