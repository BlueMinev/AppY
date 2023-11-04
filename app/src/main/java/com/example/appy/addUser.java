package com.example.appy;
public class addUser {
    public static void main(String[] args){
        //test data
        user user1 = new user("benignsublime", "yourMum");
        user user2 = new user("Rhea","malteaserCheesecake");
        System.out.println("test");
        System.out.println(user1.getUsername());
        user1.addFollower(user2.getUsername());
        user1.addFollower("1");
        user1.addFollower("2");
        System.out.println(user1.getFollowingList());
        user1.removerFollower("Rhea");
        System.out.println(user1.getFollowingList());
    }}
