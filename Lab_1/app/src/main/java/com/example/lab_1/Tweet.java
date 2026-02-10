package com.example.lab_1;

import java.util.Date;

public abstract class Tweet implements Tweetable{
    private Date date;
    private String message;
    public Tweet(String msg){
        this.message = msg;
        this.date = new Date();
    }
    public Tweet(String msg, Date date)
    {
        this.message = msg;
        this.date = date;
    }
    public String getMessage(){
        return this.message;
    }
    public Date getDate(){
        return this.date;
    }
    public void setMessage(String msg){
        this.message = msg;
    }
    public void setDate(Date date){
        this.date = date;
    }
    public abstract Boolean isImportant();
}
