package com.webcheckers.model;

public class Message {
    private String text;

    public Message() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    enum Type{
        info,error;
    }
    private Type type;

    // Constructor
    public Message(String text, Type type){
        this.setText(text);
        this.setType(type);
    }

}
