package sessao13.exercicio2.application;

import sessao13.exercicio2.entities.ImportedProduct;
import sessao13.exercicio2.entities.Product;
import sessao13.exercicio2.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main (String [] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int prodNumber = sc.nextInt();

        for(int i =0; i<prodNumber;i++){
            System.out.printf("Product #%d", i+1);
            System.out.print("Common, used or imported (c/u/i): ");
            String answer = sc.next();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            switch (answer) {
                case "c" -> {
                    Product product = new Product(name, price);
                    products.add(product);
                }
                case "u" -> {
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    Date date = sdf.parse(sc.next());
                    Product product = new UsedProduct(name, price, date);
                    products.add(product);
                }
                case "i" -> {
                    System.out.print("Custom fee: ");
                    double customFee = sc.nextDouble();
                    Product product = new ImportedProduct(name, price, customFee);
                    products.add(product);
                }
            }
        }
        for (Product product : products){
            System.out.print(product.priceTag());
        }
    }
}
