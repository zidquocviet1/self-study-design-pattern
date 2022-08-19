package com.mqv.structural.decorator.coffee.command;

import com.mqv.behavior.commandpattern.command.BaseCommand;
import com.mqv.structural.decorator.coffee.OrderProcessor;
import com.mqv.structural.decorator.coffee.exception.UnsupportedProcessorException;
import com.mqv.structural.decorator.coffee.receiver.Barista;
import com.mqv.structural.decorator.coffee.model.Order;
import com.mqv.structural.decorator.coffee.receiver.Cashier;

public record ProcessOrderCommand(OrderProcessor processor, Order order) implements BaseCommand {
    @Override
    public void execute() {
        if (processor instanceof Barista barista) {
            barista.process(order);
        } else if (processor instanceof Cashier cashier) {
            try {
                cashier.waitForAvailableAndProcess(System.currentTimeMillis() + 3000);
                cashier.process(order);
            } catch (InterruptedException e) {
                System.out.println("The cashier busied");
            }
        } else {
            throw new UnsupportedProcessorException();
        }
    }
}
