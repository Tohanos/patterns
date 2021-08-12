package com.example.patterns.decorator;

public class LeftQuoteDecorator extends Decorator{
    public LeftQuoteDecorator(Printable printer) {
        super(printer);
    }

    @Override
    public void print() {
        System.out.print("\"");
        printer.print();
    }
}
