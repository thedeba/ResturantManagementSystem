
import java.util.Scanner;

public class Order_ColdBeverages {

    Scanner input = new Scanner(System.in);
    public int choice, quantity = 1;
    public String again;
    public double total = 0, pay;

    public void order_coldBeverage() {
        System.out.println("=========================================");
        System.out.println("\tWELCOME TO COLD-BEVERAGES ITEM       ");
        System.out.println("=========================================");
        System.out.println("\t  C O L D  B E V E R A G E S           ");
        System.out.println("\t  1.Fresh Lemon Drink    BDT:150.00Tk");
        System.out.println("\t  2.Cold Coffee          BDT:180.00Tk");
        System.out.println("\t  3.Apple Juice          BDT:120.00Tk");
        System.out.println("\t  4.Iced Cappuccino      BDT:250.00Tk");
        System.out.println("\t  5.Iced Latte           BDT:150.00Tk");
        System.out.println("\t  6.Cancel                  ");
        System.out.println("=========================================");
        System.out.print("Press you want to Order : ");
        choice = input.nextInt();
        if (choice == 1) {
            System.out.println("You Choice Fresh Lemon Drink");
            System.out.println("=========================================");

            System.out.print("Total number of Fresh Lemon Drink : ");
            quantity = input.nextInt();
            total = total + (quantity * 150);
            System.out.println("Total Amount is : " + total);
            System.out.println("=========================================");

            System.out.println("You want to buy another ? ");
            System.out.print("Press Y for [YES] and N for [NO] : ");
            again = input.next();
            System.out.println("=========================================");

            if (again.equalsIgnoreCase("Y")) {
                order_coldBeverage();
            } else {

                System.out.print("Enter Payment : ");
                pay = input.nextDouble();
                if (pay < total) {
                    System.out.println("=========================================");

                    System.out.println("Not Enough Payment");
                    System.out.println("=========================================");

                } else {
                    total = pay - total;
                    System.out.println("=========================================");

                    System.out.println("Customer's Return Amount is : " + total);
                    System.out.println("=========================================");

                }

            }
        } else if (choice == 2) {
            System.out.println("=========================================");

            System.out.println("You Choice Cold Coffee");
            System.out.println("=========================================");

            System.out.print("Total number of Cold Coffee: ");
            quantity = input.nextInt();
            total = total + (quantity * 180);
            System.out.println("=========================================");

            System.out.println("Total Amount is : " + total);
            System.out.println("=========================================");

            System.out.println("You want to buy another ? ");
            System.out.print("Press Y for [YES] and N for [NO] : ");
            again = input.next();
            System.out.println("=========================================");

            if (again.equalsIgnoreCase("Y")) {
                order_coldBeverage();
            } else {
                System.out.print("Enter Payment : ");
                pay = input.nextDouble();
                if (pay < total) {
                    System.out.println("=========================================");

                    System.out.println("Not Enough Payment");
                } else {
                    total = pay - total;
                    System.out.println("=========================================");

                    System.out.println("Customer's Return Amount is : " + total);
                    System.out.println("=========================================");

                }

            }

        } else if (choice == 3) {
            System.out.println("=========================================");

            System.out.println("You Choice Apple Juice");
            System.out.println("=========================================");

            System.out.print("Number of Apple Juice : ");
            quantity = input.nextInt();
            System.out.println("=========================================");

            total = total + (quantity * 120);
            System.out.println("Total Amount is : " + total);
            System.out.println("=========================================");

            System.out.println("You want to buy another ? ");
            System.out.print("Press Y for [YES] and N for [NO] : ");
            again = input.next();
            System.out.println("=========================================");

            if (again.equalsIgnoreCase("Y")) {
                order_coldBeverage();
            } else {
                System.out.print("Enter Payment : ");
                pay = input.nextDouble();
                System.out.println("=========================================");

                if (pay < total) {

                    System.out.println("Not Enough Payment");
                    System.out.println("=========================================");

                } else {
                    total = pay - total;
                    System.out.println("=========================================");

                    System.out.println("Customer's Return Amount is : " + total);
                    System.out.println("=========================================");

                }

            }
        } else if (choice == 4) {
            System.out.println("=========================================");

            System.out.println("You Choice Iced Cappacchino");
            System.out.println("=========================================");

            System.out.print("Number of Iced Cappacchino : ");
            quantity = input.nextInt();
            System.out.println("=========================================");

            total = total + (quantity * 250);
            System.out.println("Total Amount is : " + total);
            System.out.println("=========================================");

            System.out.println("You want to buy another ? ");
            System.out.print("Press Y for [YES] and N for [NO] : ");
            again = input.next();
            System.out.println("=========================================");

            if (again.equalsIgnoreCase("Y")) {
                order_coldBeverage();
            } else {
                System.out.print("Enter Payment : ");
                pay = input.nextDouble();
                System.out.println("=========================================");

                if (pay < total) {

                    System.out.println("Not Enough Payment");
                    System.out.println("=========================================");

                } else {
                    total = pay - total;
                    System.out.println("=========================================");

                    System.out.println("Customer's Return Amount is : " + total);
                    System.out.println("=========================================");

                }

            }
        } else if (choice == 5) {
            System.out.println("=========================================");

            System.out.println("You Choice Iced Latte");
            System.out.println("=========================================");

            System.out.print("Number of Iced Latte : ");
            quantity = input.nextInt();
            System.out.println("=========================================");

            total = total + (quantity * 150);
            System.out.println("Total Amount is : " + total);
            System.out.println("=========================================");

            System.out.println("You want to buy another ? ");
            System.out.print("Press Y for [YES] and N for [NO] : ");
            again = input.next();
            System.out.println("=========================================");

            if (again.equalsIgnoreCase("Y")) {
                order_coldBeverage();
            } else {
                System.out.print("Enter Payment : ");
                pay = input.nextDouble();
                System.out.println("=========================================");

                if (pay < total) {

                    System.out.println("Not Enough Payment");
                    System.out.println("=========================================");

                } else {
                    total = pay - total;
                    System.out.println("=========================================");

                    System.out.println("Customer's Return Amount is : " + total);
                    System.out.println("=========================================");

                }

            }
        } else if (choice == 6) {
            System.exit(0);
        } else {
            System.out.println("=========================================");

            System.out.println("Choose 1 to 6 only");
            System.out.println("=========================================");

            order_coldBeverage();
        }
    }
}

