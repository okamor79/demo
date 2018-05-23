package ua.logos.mail;

import lombok.Data;

@Data
public class Mail {

    private String from;
    private String to;
    private String subject;
    private String message;

    public Mail(){
        this.from="okaminskyi79@gmail.com";
    }

}
