package com.example.patterns.decorator;

public class DecoratorExample {
    public static void main(String[] args) {
        Printable printer = new LeftQuoteDecorator(
                new RightQuoteDecorator(
                        new Printer("It's a good day, sir!")));
        printer.print();
    }
}
