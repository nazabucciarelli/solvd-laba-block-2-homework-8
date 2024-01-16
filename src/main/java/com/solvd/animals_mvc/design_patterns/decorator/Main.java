package com.solvd.animals_mvc.design_patterns.decorator;

public class Main {
    public static void main(String[] args) {
        INotifier notifier = new TelegramNotifierDecorator(
                new SlackNotifierDecorator(
                        new SMSNotifier("nazareno")));
        notifier.send("solvd");
    }
}
