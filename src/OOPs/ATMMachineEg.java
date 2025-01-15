package OOPs;

import java.util.Scanner;

abstract class ATM {
    protected double balance;

    public ATM(double initialBalance) {
        this.balance = initialBalance;
    }

    // Abstract methods
    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public abstract void checkBalance();
}

// Concrete class implementing ATM functionalities
class BankATM extends ATM {
    public BankATM(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Successfully withdrawn: " + amount);
            } else {
                System.out.println("Insufficient funds!");
            }
        } else {
            System.out.println("Withdrawal amount must be greater than zero.");
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("Your current balance is: " + balance);
    }
}

class ATMMachineEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BankATM myATM = new BankATM(1000.0); // Initial balance is 1000.0

	        System.out.println("Welcome to the ATM System!");

	        // Operations
	        myATM.checkBalance();
	        myATM.deposit(500.0);
//	        myATM.withdraw(300.0);
//	        myATM.withdraw(1500.0); // Attempt to withdraw more than the balance
//	        myATM.checkBalance();
	}

}
