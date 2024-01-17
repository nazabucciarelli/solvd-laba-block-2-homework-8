package com.solvd.animals_mvc.design_patterns.decorator.decorator;

public abstract class BaseNotifierDecorator implements INotifier {
    private final INotifier wrapped;

    BaseNotifierDecorator(INotifier wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void send(String message) {
        wrapped.send(message);
    }

    @Override
    public String getUsername() {
        return wrapped.getUsername();
    }
}
