package com.turgaydede.behavioral.command;

public class CommandPatternDemo {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("12345", 5000);
        BankAccount account2 = new BankAccount("67890", 3000);
        BankTransactionInvoker invoker = new BankTransactionInvoker();


        Command depositCommand = new DepositCommand(account1, 1000);
        invoker.executeCommand(depositCommand);
        System.out.println("Para yatırma işlemi tamamlandı.");


        Command withdrawCommand = new WithdrawCommand(account1, 500);
        invoker.executeCommand(withdrawCommand);
        System.out.println("Para çekme işlemi tamamlandı.");

        Command transferCommand = new TransferCommand(account1, account2, 300);
        invoker.executeCommand(transferCommand);
        System.out.println("Transfer işlemi tamamlandı.");

        invoker.undoCommand();
        System.out.println("Son işlem geri alındı.");

        invoker.redoCommand();
        System.out.println("Son işlem tekrarlandı.");
    }
}
