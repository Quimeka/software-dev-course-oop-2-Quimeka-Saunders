package org.example;

import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    private final static LemonadeStand lemonadeStand = new LemonadeStand();

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static void mainMenu() {
        while (true) {
            System.out.println("--------------------------------");
            System.out.println(" Main Menu");
            System.out.println("--------------------------------");
            System.out.println("1. Enter Normal Sale");
            System.out.println("2. Enter Normal Sale with Discount");
            System.out.println("3. Enter Custom Sale with Discount");
            System.out.println("4. Enter Custom Sale");
            System.out.println("5. Display Inventory");
            System.out.println("6. Display Money");
            System.out.println("7. Buy Supplies");
            System.out.println("8. Exit");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                enterNormalSale();
            }else if(choice.equals("2")){
                enterNormalDiscountSale();
            }else if(choice.equals("3")){
                enterCustomDiscountSale();
            } else if (choice.equals("4")) {
                enterCustomSale();
            } else if (choice.equals("5")) {
                displayInventory();
            } else if (choice.equals("6")) {
                displayMoney();
            } else if (choice.equals("7")) {
                buySupplies();
            } else if (choice.equals("8")) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }

        }
    }

    public static void enterNormalSale() {
        System.out.println("Enter the number of lemonades to sell:");
        int numLemonades = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numLemonades; i++) {
            if (lemonadeStand.sellLemonade()) {
                System.out.println("Lemonade sold!");
            } else {
                System.out.println("Not enough supplies to sell lemonade.");
            }
        }
    }

    public static void enterNormalDiscountSale() {
        System.out.println("Enter the number of lemonades to sell:");
        int numLemonades = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the discount price for the lemonades:");
        int discountLemonades = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numLemonades; i++) {
            if (lemonadeStand.sellLemonade(discountLemonades)) {
                System.out.println("Lemonade sold!");
            } else {
                System.out.println("Not enough supplies to sell lemonade.");
            }
        }
    }

    public static void enterCustomSale() {
        System.out.println("Enter the number of lemons to use:");
        int lemons = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the number of sugar to use:");
        int sugar = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the number of ice to use:");
        int ice = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the number of lemonades to sell:");
        int numLemonades = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numLemonades; i++) {
            if (lemonadeStand.sellLemonade(lemons, sugar, ice)) {
                System.out.println("Lemonade sold!");
            } else {
                System.out.println("Not enough supplies to sell lemonade.");
            }
        }
    }

    public static void enterCustomDiscountSale() {
        System.out.println("Enter the number of lemons to use:");
        int lemons = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the number of sugar to use:");
        int sugar = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the number of ice to use:");
        int ice = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the number of lemonades to sell:");
        int numLemonades = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the discount price for the lemonades:");
        int discountLemonades = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numLemonades; i++) {
            if (lemonadeStand.sellLemonade(lemons, sugar, ice, discountLemonades)) {
                System.out.println("Lemonade sold!");
            } else {
                System.out.println("Not enough supplies to sell lemonade.");
            }
        }
    }

    public static void displayInventory() {
        System.out.println("Lemons: " + lemonadeStand.getLemons());
        System.out.println("Sugar: " + lemonadeStand.getSugar());
        System.out.println("Ice: " + lemonadeStand.getIce());
    }

    public static void displayMoney() {
        System.out.println("Money: $" + lemonadeStand.getMoney());
    }

    public static void buySupplies() {
        System.out.println("Enter the number of lemons to buy:");
        int lemons = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the number of sugar to buy:");
        int sugar = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the number of ice to buy:");
        int ice = Integer.parseInt(scanner.nextLine());

        lemonadeStand.buySupplies(lemons, sugar, ice);
    }
}