package com.example.dp2025.chainOfResponse;

public class Main {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        Handler handler=new UserExistHandler(dataBase).
                setNextHandler(new ValidPasswordHandler(dataBase));
        
    }
}
