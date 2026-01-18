package com.example.dp2025.Bridge;

public abstract class Remote {
    private EntartinmentDevice device;
    public Remote(EntartinmentDevice device){
        this.device = device;
    }
    public abstract void buttonUp();
    public abstract void buttonDown();
    public EntartinmentDevice getDevice() {
        return device;
    }
}
