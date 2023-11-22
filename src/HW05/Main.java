package HW05;

import java.util.Scanner;

public class Main {

    static String[] products;
    static String productName;
    static int count;

    public static void main(String[] args) {

        products = new String[]{"apple", "kiwi", "mango", "banana", "grape", "apple", "mango"};
        count = 0;

        System.out.println("The procurement package consists of:");
        for (String product : products) {
            count += 1;
            System.out.println(count + ") " + product);
        }

        Scanner productScanner = new Scanner(System.in);

        System.out.print("------------------------------\n" +
                "Please, enter a product name: ");
        productName = productScanner.nextLine();

        count = 0;

        System.out.println("------------------------------");

        for (int i = 0; i < products.length; i += 1) {

            if (products[i].equals(productName)) {
                count += 1;
                System.out.println("Product is available. Position is: " + (i + 1) + ".");
            }
        }

        if (count > 0) {
            System.out.println("Quantity of products in the set: " + count + ".");
        } else {
            System.out.println("Sorry, but the product is not in the set...");
        }
    }
}
