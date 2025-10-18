import org.codehaus.groovy.transform.SourceURIASTTransformation;

import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //JAVA Banking program for beginners

        //Declare variables
        Scanner scanner = new Scanner(System.in);


        double balance=0;
        boolean isRunning = true;
        int choice;
while(isRunning) {
    System.out.println("*****************");
    System.out.println("BANKING PROGRAM");
    System.out.println("*****************");
    System.out.println("1. Show Balance");
    System.out.println("2. Deposit");
    System.out.println("3. Withdraw");
    System.out.println("4. Exit");
    System.out.println("*****************");

    System.out.println("Enter your choice (1-4): ");
    choice = scanner.nextInt();


    switch (choice) {
        case 1 -> showBalance(balance);
        case 2 -> System.out.println("DEPOSIT");
        case 3 -> System.out.println("WITHDRAW");
        case 4 -> isRunning = false;
        default -> System.out.println("INVALID CHOICE");
    }
}
    //Display Menu

    //Get and process users choice

    //showBalance()

    //deposit()

    //Withdraw()

    //Exit Message
scanner.close();
    }
    static void showBalance(double balance){
        System.out.printf("$%.2f", balance);
    }
     static double deposit(){
        double amount;

         System.out.print("Enter an amount to be deposited: ");
         amount = scanner.nextDouble();
         if(amount<0){
             System.out.println("Amount can't ");
         }

         return 0;
     }
}
