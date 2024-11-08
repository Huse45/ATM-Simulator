// ---------------------------------------------------------
// Assignment 3
// Written by: Huseyin Pilavci 40312242
// For COMP 248 Section H – Fall 2024
// ---------------------------------------------------------
import java.util.Scanner;
public class A3_Q1 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                double balance = 0.0;
                int choice;

                System.out.println("Welcome to the Best Bank ATM!");

                do {
                    System.out.println("----------------------------------------------------");
                    System.out.println("Please choose an option:");
                    System.out.println("\t1. Check Balance");
                    System.out.println("\t2. Deposit");
                    System.out.println("\t3. Withdraw");
                    System.out.println("\t4. Exit");
                    System.out.print("Enter your choice: ");
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            // Checking Balance
                            System.out.printf("Your balance is: $%.2f%n", balance);
                            System.out.println();
                            break;

                        case 2:
                            // Depositing money
                            System.out.print("Enter amount to deposit: ");
                            double deposit = sc.nextDouble();
                            if (deposit >= 5 && deposit <= 10000) {
                                balance += deposit;
                                System.out.println("Deposit successful!\n");
                            } else {
                                System.out.println("Invalid deposit amount! Must be between $5 and $10,000.\n");
                            }
                            break;

                        case 3:
                            // Withdrawing money
                            System.out.print("Enter amount to withdraw (multiples of 5, 10, 50, or 100): ");
                            int withdraw = sc.nextInt();
                            if (withdraw % 5 == 0 && withdraw <= balance && withdraw <= 1000) {
                                balance -= withdraw;

                                // Distributing bills according to the amount to withdraw
                                int hundreds = withdraw / 100;
                                withdraw %= 100;
                                int fifties = withdraw / 50;
                                withdraw %= 50;
                                int tens = withdraw / 10;
                                withdraw %= 10;
                                int fives = withdraw / 5;
                                System.out.println("You will receive:");
                                if (hundreds > 0) {
                                    System.out.printf("    %d bill(s) of $100%n", hundreds);
                                }if (fifties > 0) {
                                    System.out.printf("    %d bill(s) of $50%n", fifties);
                                }if (tens > 0) {
                                    System.out.printf("    %d bill(s) of $10%n", tens);
                                }if (fives > 0) {
                                    System.out.printf("    %d bill(s) of $5%n", fives);
                                }
                                System.out.println("Withdrawal successful!\n");
                            } else if (withdraw > 1000) {
                                System.out.println("Invalid withdrawal amount! Maximum withdrawal is $1,000.\n");
                            } else if (withdraw > balance) {
                                System.out.println("Insufficient funds!\n");
                            } else {
                                System.out.println("Invalid withdrawal amount! You can only withdraw amounts that are multiples of 5, 10, 50, or 100.\n");
                            }
                            break;

                        case 4:
                            // Exit
                            System.out.println("Goodbye!");
                            break;

                        default:
                            System.out.println("Invalid choice! Please try again.\n");
                    }
                } while (choice != 4);

                sc.close();
            }
        }















