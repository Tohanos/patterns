package com.example.patterns.decorator;

public abstract class Decorator implements Printable{
    Printable printer;

    public Decorator(Printable printer) {
        this.printer = printer;
    }
}
