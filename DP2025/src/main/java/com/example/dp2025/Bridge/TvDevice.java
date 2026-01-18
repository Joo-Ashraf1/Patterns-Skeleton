package com.example.dp2025.Bridge;

public class TvDevice extends EntartinmentDevice {
    public TvDevice(int newDeviceState,int newVolume) {
        deviceState = newDeviceState;
        volumeSetting = newVolume;
    }
    @Override
    public void buttonUp() {
        System.out.println("Channel Down");
        deviceState--;

    }

    @Override
    public void buttonDown() {
        System.out.println("Channel Up");
        deviceState++;

    }
}
