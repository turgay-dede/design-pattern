package com.turgaydede.behavioral.command;

import java.util.Stack;

public class BankTransactionInvoker {
    private Stack<Command> commandHistory = new Stack<>();
    private Stack<Command> redoCommands = new Stack<>();

    public void executeCommand(Command command) {
        command.execute();
        commandHistory.push(command);
        redoCommands.clear();
    }

    public void undoCommand() {
        if (!commandHistory.isEmpty()) {
            Command command = commandHistory.pop();
            command.undo();
            redoCommands.push(command);
        } else {
            System.out.println("Geri alacak işlem yok.");
        }
    }

    public void redoCommand() {
        if (!redoCommands.isEmpty()) {
            Command command = redoCommands.pop();
            command.execute();
        } else {
            System.out.println("Tekrarlanacak işlem yok.");
        }
    }
}
