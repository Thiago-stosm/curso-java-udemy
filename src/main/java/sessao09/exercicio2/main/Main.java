package sessao09.exercicio2.main;

import sessao09.exercicio2.entities.Product;
import java.util.*;

public class Main {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        Product product;
        int productAmount;

        System.out.println("Enter Product Name: ");
        String name = sc.next();
        sc.nextLine();

        System.out.println("Enter Product ID: ");
        int NUMBER = sc.nextInt();

        System.out.println("Enter Product Price: ");
        double PRICE = sc.nextDouble();

        System.out.println("Do you want to enter a initial stock? (y/n)");
        String answer = sc.next();

        if (answer.equalsIgnoreCase("y")){
            System.out.println("Enter de initial quantity: ");
            int initialQtd = sc.nextInt();
            product = new Product(NUMBER, PRICE, name, initialQtd);
            System.out.print(product);
        }
        else{
            product = new Product( NUMBER, PRICE, name);
            System.out.print(product);
        }

        System.out.println("Lets add some products to our storage");
        productAmount = sc.nextInt();
        product.addProduct(productAmount);
        System.out.print(product);

        System.out.println("Lets remove some products to our storage");
        productAmount = sc.nextInt();
        if (productAmount > product.getStock()){
            while(productAmount > product.getStock()){
                System.out.println("This quantity cannot be withdrawn as it is greater than the current stock ");
                System.out.println("Enter a new value, less than " + (product.getStock()+1));
                productAmount = sc.nextInt();
            }
        }
        product.subProduct(productAmount);
        System.out.print(product);

    }
}

/*// No Product.java
public boolean subProduct(int productAmount){
    if (productAmount > this.stock) {
        // Se a remoção for inválida, não faz nada e retorna 'false'
        return false;
    }
    // Se for válida, subtrai e retorna 'true'
    this.stock -= productAmount;
    return true;

    // Em Main.java
System.out.println("Lets remove some products to our storage");
productAmount = sc.nextInt();

// Chama o método e verifica o retorno
if (product.subProduct(productAmount)) {
    System.out.println("Removal successful!");
} else {
    System.out.println("Removal failed. Stock is insufficient.");
}

System.out.print(product); // Mostra o estado final

    Nessa correção, foi-se consertado um problema relacionado a alta coesão do código no sistema.
    A parte da correção se refere a operação lógica do método subProduct, que estava ocorrendo no
    main e não no próprio método.
}*/


