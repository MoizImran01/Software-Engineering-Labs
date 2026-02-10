package com.example.lab_1;

import java.util.Date;

public class SadMood extends Mood {
    public SadMood(){
        super();
    }
    public SadMood(Date date){
        super(date);
    }
    @Override public String getMood(){
        return "I am sad :(";
    }

}
