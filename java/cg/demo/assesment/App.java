package cg.demo.assesment;

import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        AppDAO logicDAO = new AppDAO();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\nWhat to do?");
            System.out.println("1: Add Order");
            System.out.println("2: View Order by id");
            System.out.println("3: View order by customer name");
            System.out.println("4: Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1: {
                    System.out.println("Enter Order id:");
                    int id = scanner.nextInt();

                    System.out.println("Enter order date:");
                    String date = scanner.next();
                    scanner.nextLine();

                    System.out.println("Enter Order amount:");
                    Double order_amount = scanner.nextDouble();

                    System.out.println("Enter customer id:");
                    int customer_id = scanner.nextInt();
                    scanner.nextLine();

                    AbesOrder order = new AbesOrder();
                    order.setOrderId(id);
                    order.setOrderDate(date);
                    order.setOrderAmt(order_amount);
                    Customer c = new Customer(customer_id , "Aditya");
                    order.setCustomer(c);

                    AbesOrder res = logicDAO.insertOrder(order);

                    System.out.println("Order added with ID: " + res.getOrderId());
                    break;
                }

                case 2: {
                    System.out.println("Enter Order id:");
                    int orderId = scanner.nextInt();

                    AbesOrder a= logicDAO.getOrderById(orderId);
                    System.out.println(a);
                    break;
                }

                case 3: {
                    System.out.println("Enter customer name:");
                    String name = scanner.nextLine();

                    List<AbesOrder> a = logicDAO.findOrderByName(name);
                    for(AbesOrder  x: a) {
                    	System.out.println(a);
                    }
                    break;
                }

                case 4: {
                    System.out.println("Exiting...");
                    System.exit(0);
                }

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}