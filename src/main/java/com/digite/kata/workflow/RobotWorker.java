package com.digite.kata.workflow;

public class RobotWorker implements Worker{

    public void work() {
        // ....working
    }

    public void eat() {
        throw new RuntimeException();
    }
}
