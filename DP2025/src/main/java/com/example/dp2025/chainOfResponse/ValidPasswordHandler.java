package com.example.dp2025.chainOfResponse;

public class ValidPasswordHandler extends Handler {
    private DataBase dataBase;
    public ValidPasswordHandler(DataBase dataBase){
        this.dataBase=dataBase;
    }
    @Override
    public boolean handle(String userName, String password) {
        if(!dataBase.isValidPassword(userName,password)){
            return false;
        }
        return handleNext(userName,password);

    }

}
