package com.example.appy;

import java.util.ArrayList;

public class user {
 static String username = "";
 String email = "";
 String password = "";
 ArrayList<String> followingList = new ArrayList<>();

 public user(){}
 public user(String usernameIn, String passwordIn){
  username = usernameIn;
  password = passwordIn;
 }

 public void setUsername(String name){
  username = name ;
 }

 public void setEmail(String Email){
  email = Email;
 }

 public void setPassword(String pass){
  password = pass;
 }
 public void addFollower(String UName){
  followingList.add(UName);
 }

 public void removerFollower (String userIn){
  followingList.remove(userIn);
  }


 public static String getUsername() {
  return username;
 }

 public String getEmail() {
  return email;
 }

 public ArrayList<String> getFollowingList() {
  return followingList;
 }

 public boolean checkPassword(String InputPassword) {
  if (password == InputPassword){return true;} else {return false;}
 }
}
