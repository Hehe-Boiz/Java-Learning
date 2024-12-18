package exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankManager {
    private List<Account> accounts = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void displayAllAccounts() {
        for (Account account : accounts) {
            account.displayInfo();
            System.out.println();
        }
    }

    public void addAccount(Account acc) {
        accounts.add(acc);
    }

    public void searchAccountStream(String keyword) {
        accounts.stream().filter(
                account -> account.getAccountNumber().equals(keyword) || account.getAccountName().equals(keyword))
                .findFirst().ifPresentOrElse(Account::displayInfo, () -> System.out.println("Account not found."));
    }

    public void deposit(String accountNumber, double amount) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                if (acc instanceof TermAccount && !((TermAccount) acc).isMaturityDate()) {
                    System.out.println("Deposit only allowed on maturity date for term accounts.");
                    return;
                }
                acc.deposit(amount);
                System.out.println("Deposit successful.");
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public void withdraw(String accountNumber, double amount) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                if (acc instanceof TermAccount && !((TermAccount) acc).isMaturityDate()) {
                    System.out.println(
                            "only withdraw when the limit date comes. If you still want to withdraw, type yes: ");
                    String choice = sc.nextLine().toLowerCase();

                    if (choice.equals("yes")) {
                        accounts.remove(acc);
                        NoTermAccount newAccount = new NoTermAccount(accountNumber, accountNumber, choice, amount);
                        accounts.add(newAccount);
                        System.out.println("transfer to demand account");
                    } else {
                        return;
                    }
                }
                acc.withdraw(amount);
                System.out.println("Withdraw successful.");
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public void calculateInterest(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                double rate = 0.1;
                if (account instanceof TermAccount) {
                    TermAccount termAccount = (TermAccount) account;
                    switch (termAccount.getTerm()) {
                        case MOT_TUAN:
                            rate = 0.5;
                            break;
                        case MOT_THANG:
                            rate = 4.5;
                            break;
                        case MOT_NAM:
                            rate = 6.8;
                            break;
                    }
                }
                account.addInterest(rate);
                System.out.println("Interest calculated and added to balance.");
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public void updateMaturityDate(String accountNumber, KyHan newTerm) {
        for (Account acc : accounts) {
            if (acc instanceof TermAccount && acc.getAccountNumber().equals(accountNumber)) {
                TermAccount termAccount = (TermAccount) acc;
                termAccount.updateMaturityDate(newTerm);
                return;
            }
        }
        System.out.println("Account not found.");
    }
}
