package com.vladbstrv.noteapp.models;

public class Note {

    private String title;
    private String text;

    public Note(String name, String text) {
        this.title = name;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
