package exercise4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankManager manager = new BankManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Account");
            System.out.println("2. Search Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Calculate Interest");
            System.out.println("6. Display All Accounts");
            System.out.println("7. Update Maturity Date");
            System.out.println("8. Exit");
            System.out.print("Choose: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter account name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter balance: ");
                    double balance = scanner.nextDouble();
                    System.out.print("Is term account? (yes/no): ");
                    String isTerm = scanner.next();
                    if (isTerm.equalsIgnoreCase("yes")) {
                        System.out.print("Enter term (ONE_WEEK/ONE_MONTH/ONE_YEAR): ");
                        KyHan term = KyHan.valueOf(scanner.next());
                        manager.addAccount(new TermAccount(name, phone, email, balance, term));
                    } else {
                        manager.addAccount(new NoTermAccount(name, phone, email, balance));
                    }
                }
                case 2 -> {
                    System.out.print("Enter account number or name: ");
                    String keyword = scanner.nextLine();
                    manager.searchAccount(keyword);
                }
                case 3 -> {
                    System.out.print("Enter account number: ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("Enter amount: ");
                    double amount = scanner.nextDouble();
                    manager.deposit(accountNumber, amount);
                }
                case 4 -> {
                    System.out.print("Enter account number: ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("Enter amount: ");
                    double amount = scanner.nextDouble();
                    manager.withdraw(accountNumber, amount);
                }
                case 5 -> {
                    System.out.print("Enter account number: ");
                    String accountNumber = scanner.nextLine();
                    manager.calculateInterest(accountNumber);
                }
                case 6 -> manager.displayAllAccounts();
                case 7 -> {
                    System.out.print("Enter account number: ");
                    String accountNumber = scanner.nextLine();
                    System.out.print(
                            "Enter new term (ONE_WEEK/ONE_MONTH/ONE_YEAR) or leave empty to keep current term: ");
                    String termInput = scanner.nextLine();
                    KyHan newTerm = termInput.isEmpty() ? null : KyHan.valueOf(termInput);
                    manager.updateMaturityDate(accountNumber, newTerm);
                }
                case 8 -> System.exit(0);
                default -> System.out.println("Invalid choice.");
            }
            scanner.close();
        }
    }
}
