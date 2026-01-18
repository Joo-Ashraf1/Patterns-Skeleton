package com.example.dp2025.Observe;

import java.util.List;

public class StockGrabber implements subject{
    private List<observer> observers;
    private double price;
    @Override
    public void addObserver(observer o) {
        observers.add(o);

    }

    @Override
    public void removeObserver(observer o) {
        int observerIndex=observers.indexOf(o);
        System.out.println("Removed observer "+observers.get(observerIndex));
        observers.remove(observerIndex);

    }

    @Override
    public void notifyObserver() {
    for(observer o:observers){
        o.update(price);
    }
    }
    public void setPrice(double price) {
        this.price = price;
        notifyObserver();
    }
}
