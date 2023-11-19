
import java.util.Scanner;

public class Order_HotBeverage {

    Scanner input = new Scanner(System.in);
    public int choice, quantity = 1;
    public String again;
    public double total = 0, pay;

    public void orderHotBeverage() {
        System.out.println("=========================================");
        System.out.println("\t WELCOME TO COFFEE ITEMS        ");
        System.out.println("=========================================");
        System.out.println("\t\t  C O F F E E           ");
        System.out.println("\t  1.Espresso         BDT:60.00Tk");
        System.out.println("\t  2.Red Eye          BDT:80.00Tk");
        System.out.println("\t  3.Americano        BDT:100.00Tk");
        System.out.println("\t  4.Macchiato        BDT:150.00Tk");
        System.out.println("\t  5.Cancel                  ");
        System.out.println("=========================================");
        System.out.print("Press you want to Order : ");
        choice = input.nextInt();
        if (choice == 1) {
            System.out.println("You Choice <<Espresso>>");
            System.out.println("=========================================");

            System.out.print("How many Espresso you to want to Coffee : ");
            quantity = input.nextInt();
            total = total + (quantity * 60);
            System.out.println("Total Amount is : " + total);
            System.out.println("=========================================");

            System.out.println("You want to buy another ? ");
            System.out.print("Press Y for [YES] and N for [NO] : ");
            again = input.next();
            System.out.println("=========================================");

            if (again.equalsIgnoreCase("Y")) {
                orderHotBeverage();
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

            System.out.println("You Choice <<Red Eye>>");
            System.out.println("=========================================");

            System.out.print("How many <<Red Eye>> you to want to Coffee : ");
            quantity = input.nextInt();
            total = total + (quantity * 80);
            System.out.println("=========================================");

            System.out.println("Total Amount is : " + total);
            System.out.println("=========================================");

            System.out.println("You want to buy another ? ");
            System.out.print("Press Y for [YES] and N for [NO] : ");
            again = input.next();
            System.out.println("=========================================");

            if (again.equalsIgnoreCase("Y")) {
                orderHotBeverage();
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

            System.out.println("You Choice <<Americano>>");
            System.out.println("=========================================");

            System.out.print("How many Plate of <<Americano>> you to want to Coffee : ");
            quantity = input.nextInt();
            System.out.println("=========================================");

            total = total + (quantity * 100);
            System.out.println("Total Amount is : " + total);
            System.out.println("=========================================");

            System.out.println("You want to buy another ? ");
            System.out.print("Press Y for [YES] and N for [NO] : ");
            again = input.next();
            System.out.println("=========================================");

            if (again.equalsIgnoreCase("Y")) {
                orderHotBeverage();
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
        }else if (choice == 4) {
            System.out.println("=========================================");

            System.out.println("You Choice <<Macchiato>>");
            System.out.println("=========================================");

            System.out.print("How many Plate of <<Macchiato>> you to want to Coffee : ");
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
                orderHotBeverage();
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
        } 
        else if (choice == 5) {
            System.exit(0);
        } else {
            System.out.println("=========================================");

            System.out.println("Choose 1 to 5 only");
            System.out.println("=========================================");

            orderHotBeverage();
        }
    }
}
