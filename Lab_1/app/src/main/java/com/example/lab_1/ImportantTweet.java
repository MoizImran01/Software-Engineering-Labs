package com.example.lab_1;

import java.util.Date;

public class ImportantTweet extends Tweet {
    public ImportantTweet(String msg){
        super(msg);
    }
    public ImportantTweet(String msg, Date date){
        super(msg, date);
    }
    @Override public Boolean isImportant(){
        return Boolean.TRUE;
    }
}
