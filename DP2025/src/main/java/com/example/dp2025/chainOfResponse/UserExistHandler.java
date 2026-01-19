package com.example.dp2025.chainOfResponse;

public class UserExistHandler extends Handler{
    private DataBase dataBase;
    public UserExistHandler(DataBase dataBase){
        this.dataBase=dataBase;
    }
    @Override
    public boolean handle(String userName, String password) {
        if(!dataBase.isValidUser(userName)){
            return false;
        }

        return handleNext(userName,password);
    }
}
