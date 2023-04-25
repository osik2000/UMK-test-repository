package com.example.workshops;


public class Text{

    private int id;
    private String text;

    public Text(){

    }

    public Text(int id, String text){
        this.id = id;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Text["+ id +
                "]: " + text;
    }
}
