package com.example.dp2025.chainOfResponse;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
    private final Map<String,String> users;
    public DataBase() {
        users=new HashMap<>();
        users.put("adminUser","adminPassword");
        users.put("studentUser","studentPassword");
    }
    public boolean isValidUser(String username){
        return users.containsKey(username);
    }
    public boolean isValidPassword(String username,String password){
        return users.get(username).equals(password);
    }
}
