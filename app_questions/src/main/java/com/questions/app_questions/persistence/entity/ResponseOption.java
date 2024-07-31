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
@Table(name = "response_options")  
public class ResponseOption {  
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;  

    @Column(name = "option_value")
    private String optionValue;  

    @ManyToOne  
    @JoinColumn(name = "question_id")  
    private Question question;  

    @Column(name = "comment_response")
    private String commetResponse;  

    @Column(name = "option_text")
    private String optionText;  

    @Column(name = "question_parent")
    private Integer questionParent;

    

    public ResponseOption() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOptionValue() {
        return optionValue;
    }

    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getCommetResponse() {
        return commetResponse;
    }

    public void setCommetResponse(String commetResponse) {
        this.commetResponse = commetResponse;
    }

    public String getOptionText() {
        return optionText;
    }

    public void setOptionText(String optionText) {
        this.optionText = optionText;
    }

    public Integer getQuestionParent() {
        return questionParent;
    }

    public void setQuestionParent(Integer questionParent) {
        this.questionParent = questionParent;
    }

    @Override
    public String toString() {
        return "ResponseOption [id=" + id + ", optionValue=" + optionValue + ", question=" + question
                + ", commetResponse=" + commetResponse + ", optionText=" + optionText + ", questionParent="
                + questionParent + "]";
    }  


}
