package com.example.restservice;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Pessoa <User>{

    private String name;
    private int position;
    private long registrationDate;

    public void User(String name, String phone, String email) {
        this.name = name;
        this.position = 0;
        this.registrationDate = System.currentTimeMillis();
    }

    /**
     * @param otherUser
     * @return
     */
    @Override
    public int CompareTo (User otherUser) {
        if (this.registrationDate < otherUser.registrationDate) {
            return -1;
        } else if (this.registrationDate > otherUser.registrationDate) {
            return 1;
        } else {
            return 0;
        }
    }
}

