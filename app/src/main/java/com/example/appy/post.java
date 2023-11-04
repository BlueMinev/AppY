package com.example.appy;

public class post {
    String title = "";
    String contents = "";
    Integer postID;
    Integer likes;
    String username = "";

    public void setUsername(String currentUser){
        username = currentUser;
    }

    public void setTitle(String titleIn){
        title = titleIn;
    }

    public void setContents(String contentsIn){
        contents = contentsIn;
    }

    public void updateLikes(Integer changeInLikes){
        likes = likes + changeInLikes;
    }
}
