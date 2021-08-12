package com.example.patterns.decorator;

public class RightQuoteDecorator extends Decorator{
    public RightQuoteDecorator(Printable printer) {
        super(printer);
    }

    @Override
    public void print() {
        printer.print();
        System.out.print("\"");
    }
}
