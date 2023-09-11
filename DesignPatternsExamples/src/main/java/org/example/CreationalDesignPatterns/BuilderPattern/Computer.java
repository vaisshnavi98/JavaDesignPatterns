package org.example.CreationalDesignPatterns.BuilderPattern;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Computer {

    private String HDD;
    private String RAM;

    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;
}
