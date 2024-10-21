import java.util.Scanner;

public class Exercise14 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){  
        vendingMachine();
    }
    
    
    
    
    
    
    
    
    static void vendingMachine(){
        int money, change, number;
        do{
            System.out.println("----Menu----");
            System.out.println("1. Coca");
            System.out.println("2. Pepsi");
            System.out.println("3. Sprite");
            System.out.println("4. Snack");
            System.out.println("5. Shutdown Machine");
            System.out.print("Please enter the number: ");
            number=sc.nextInt();
            switch (number) {
                case 1:
                    System.out.print("The price of Coca is: 2$, please enter the amount of money: ");
                    money=sc.nextInt();
                    change=money -2;
                    if(change>=0){
                        System.out.println("Your change is " +change +"$");
                    }
                    else{
                        System.out.println("Not enough money to buy this item. Plese select again.");
                    }
                    break;
                case 2:
                    System.out.print("The price of Pepsi is: 2$, please enter the amount of money: ");
                    money =sc.nextInt();
                    change=money -2;
                    if(change>=0){
                        System.out.println("Your change is " +change+"$");
                    }
                    else{
                        System.out.println("Not enough money to buy this item. Please select again.");
                    }
                    break;
                case 3:
                    System.out.println("The price of Sprite is: 2$, please enter the amount of money: ");
                    money =sc.nextInt();
                    change=money-2;
                    if(change>=0){
                        System.out.println("Your change is "+change +"$");
                    }
                    else{
                        System.out.println("Not enough money to buy this item. Please select again.");
                    }
                    break;
                case 4: 
                    System.out.println("The price of Sprite is: 1$, please enter the amount of money: ");
                    money =sc.nextInt();
                    change=money-2;
                    if(change>=0){
                        System.out.println("Your change is "+change +"$");
                    }
                    else{
                        System.out.println("Not enough money to buy this item. Please select again.");
                    }
                    break;
                default:
                    System.out.println("Machine is shutting down");
                    break;
            }
        }while(number!=5);
    }
}
