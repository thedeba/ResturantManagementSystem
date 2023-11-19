
import java.util.Scanner;

public class Order_FastFood {

    Scanner input = new Scanner(System.in);
    public int choice, quantity = 1;
    public String again;
    public double total = 0, pay;

    public void order_fastfood() {
        System.out.println("=========================================");
        System.out.println("\tWELCOME TO FAST FOOD ITEMS        ");
        System.out.println("=========================================");
        System.out.println("\t       F A S T  F O O D S           ");
        System.out.println("\t  1.Barger         BDT:90.00Tk");
        System.out.println("\t  2.Pizza          BDT:180.00Tk");
        System.out.println("\t  3.French Fry     BDT:80.00Tk");
        System.out.println("\t  4.Cancel                  ");
        System.out.println("=========================================");
        System.out.print("Press you want to Order : ");
        choice = input.nextInt();
        if (choice == 1) {
            System.out.println("You Choice Burger");
            System.out.println("=========================================");

            System.out.print("Total number of Burger : ");
            quantity = input.nextInt();
            total = total + (quantity * 90);
            System.out.println("Total Amount is : " + total);
            System.out.println("=========================================");

            System.out.println("You want to buy another ? ");
            System.out.print("Press Y for [YES] and N for [NO] : ");
            again = input.next();
            System.out.println("=========================================");

            if (again.equalsIgnoreCase("Y")) {
                order_fastfood();
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

            System.out.println("You Choice Pizza");
            System.out.println("=========================================");

            System.out.print("Total number of Pizza: ");
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
                order_fastfood();
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

            System.out.println("You Choice French Fry");
            System.out.println("=========================================");

            System.out.print("Number of French Fry : ");
            quantity = input.nextInt();
            System.out.println("=========================================");

            total = total + (quantity * 80);
            System.out.println("Total Amount is : " + total);
            System.out.println("=========================================");

            System.out.println("You want to buy another ? ");
            System.out.print("Press Y for [YES] and N for [NO] : ");
            again = input.next();
            System.out.println("=========================================");

            if (again.equalsIgnoreCase("Y")) {
                order_fastfood();
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
            System.exit(0);
        } else {
            System.out.println("=========================================");

            System.out.println("Choose 1 to 4 only");
            System.out.println("=========================================");

            order_fastfood();
        }
    }
}
