package com.example.patterns.decorator;

public class Printer implements Printable{
    String task;

    public Printer(String task) {
        this.task = task;
    }
    @Override
    public void print() {
        System.out.print(task);
    }
}
