package com.example.restservice;

import java.util.ArrayList;
import java.util.Collections;

import org.apache.catalina.User;

public class Queue {

    private ArrayList users;

    public void Queue() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        this.users.add(user);
        Collections.sort(this.users);
        updatePositions();
    }

    public void removeUser(User user) {
        this.users.remove(user);
        updatePositions();
    }

    private void updatePositions() {
        for (int i = 0; i < this.users.size(); i++) {
            this.users.get(i).setPosition(i+1);
        }
    }
}


