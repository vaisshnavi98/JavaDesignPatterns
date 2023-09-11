package org.example.CreationalDesignPatterns.BuilderPattern;

public class TestBuilderPattern {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder()
                .HDD("500 GB")
                .RAM("2 GB")
                .isBluetoothEnabled(true)
                .isGraphicsCardEnabled(true)
                .build();

    }
}
