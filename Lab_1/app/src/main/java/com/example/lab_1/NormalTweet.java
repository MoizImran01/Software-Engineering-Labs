package com.example.lab_1;

import java.util.Date;

public class NormalTweet extends Tweet {
    public NormalTweet(String msg){
        super(msg);
    }
    public NormalTweet(String msg, Date date){
        super(msg, date);
    }
    @Override public Boolean isImportant(){
        return Boolean.FALSE;
    }
}
