package com.questions.app_questions.persistence.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity  
@Table(name = "response_catalogs")  
public class ResponseCatalog {  
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;  

    private String responseOption;  

    @ManyToOne  
    @JoinColumn(name = "catalog_id")  
    private Catalog catalog;  

    @ManyToOne  
    @JoinColumn(name = "question_id")  
    private Question question;  

    @ManyToOne  
    @JoinColumn(name = "response_id")  
    private Response response;  

    private String responseText;  

    

    public ResponseCatalog() {
    }

    public Long getId() {  
        return id;  
    }  

    public void setId(Long id) {  
        this.id = id;  
    }  

    public String getResponseOption() {  
        return responseOption;  
    }  

    public void setResponseOption(String responseOption) {  
        this.responseOption = responseOption;  
    }  

    public Catalog getCatalog() {  
        return catalog;  
    }  

    public void setCatalog(Catalog catalog) {  
        this.catalog = catalog;  
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
        return "{" +  
            "id=" + id +  
            ", responseOption='" + responseOption +  
            ", catalog=" + catalog +  
            ", question=" + question +  
            ", response=" + response +  
            ", responseText='" + responseText + '\'' +  
            '}';  
    }  
}
