package com.strategy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class PatternStrategy {
    public static void main(String[] args) {


        Checker inMemory = new InMemory();
        Checker swap = new SwapDisk();
        Arch file = new Arch();

        file.setChecker(inMemory);
        file.action();
        file.action();
        file.setChecker(swap);
        file.action();
    }
}
