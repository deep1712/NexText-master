package com.google.firebase.udacity.friendlychat;

/**
 * Created by Deepanshu on 12/14/2017.
 */

public class ProfileItem {
    private String message;
    private String username;
    private int dp;
    public ProfileItem(String message, String username, int dp) {
        this.message = message;
        this.username = username;
        this.dp = dp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String text) {
        this.message = message;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String name) {
        this.username = username;
    }

    public int getDp() {
        return dp;
    }

    public void setDp(int photoUrl) {
        this.dp = dp;
    }
}
