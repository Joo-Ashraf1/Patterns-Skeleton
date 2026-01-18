package com.example.dp2025.Observe;

public interface subject {
    public void addObserver(observer o);
    public void removeObserver(observer o);
    public void notifyObserver();
}
