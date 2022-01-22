package com.strategy;

public class Arch {

    private Checker checker;

    public void setChecker(Checker checker) {
        this.checker = checker;
    }

    public void action(){
        checker.doAction();
    }

}
