package com.example.dp2025.chainOfResponse;

public abstract class Handler {
    private Handler nextHandler;
    public Handler setNextHandler(Handler next){
        this.nextHandler=next;
        return nextHandler;
    }
    public abstract boolean handle(String userName,String password);

    protected boolean handleNext(String userName,String password){
        if(nextHandler==null){
            return true;
        }
        return nextHandler.handle(userName,password)
    }
}
