package com.google.firebase.udacity.friendlychat;

/**
 * Created by Deepanshu on 12/28/2017.
 */

public class StatusItem {
    private int photoUrl;
    private String status;
    private String time;
    private String userName;

    public StatusItem(int photoUrl,String status,String time,String userName){
        this.photoUrl = photoUrl;
        this.status = status;
        this.time = time;
        this.userName = userName;
    }

    public int getPhotoUrl(){
        return photoUrl;
    }

    public void setPhotoUrl(int photoUrl){
        this.photoUrl = photoUrl;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String getTime(){
        return time;
    }

    public void setTime(String time){
        this.time = time;
    }
    public String getUserName(){
        return userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }
}
