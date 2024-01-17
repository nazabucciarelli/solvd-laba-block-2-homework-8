package com.solvd.animals_mvc.design_patterns.decorator;

import com.solvd.animals_mvc.design_patterns.decorator.decorator.INotifier;
import com.solvd.animals_mvc.design_patterns.decorator.decorator.SMSNotifier;
import com.solvd.animals_mvc.design_patterns.decorator.decorator.SlackNotifierDecorator;
import com.solvd.animals_mvc.design_patterns.decorator.decorator.TelegramNotifierDecorator;

public class Main {
    public static void main(String[] args) {
        INotifier notifier = new TelegramNotifierDecorator(
                new SlackNotifierDecorator(
                        new SMSNotifier("nazareno")));
        notifier.send("solvd");
    }
}
