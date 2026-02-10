package com.example.lab_1;

import java.util.Date;

public class HappyMood extends Mood {
    public HappyMood(){
        super();
    }
    public HappyMood(Date date){
        super(date);
    }
    @Override public String getMood(){
        return "I am happy :)";
    }

}
