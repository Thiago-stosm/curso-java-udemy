package sessao09.exercicio2.entities;

public class Product {

    private final int NUMBER;
    private final double PRICE;
    private String name;
    private int stock;

    public Product(int NUMBER, double PRICE, String name){
        this.NUMBER = NUMBER;
        this.PRICE = PRICE;
        this.name = name;
    }
    public Product(int NUMBER, double PRICE, String name, int initialQtd){
        this.NUMBER = NUMBER;
        this.PRICE = PRICE;
        this.name = name;
        this.addProduct(initialQtd);
    }

    // Getters e Setters
    public int getNUMBER(){
        return this.NUMBER;
    }
    public double getPRICE(){
        return this.PRICE;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getStock(){
        return this.stock;
    }

    // Métodos especiais
    public void addProduct(int productAmount){
        this.stock += productAmount;
    }
    public void subProduct(int productAmount){
        this.stock -= productAmount;
    }
    public String toString(){
        return "Product Name: " + getName() + "\n" +
                "Product Price: $" + getPRICE() + "\n" +
                "Product Stock: " +  this.getStock() + "\n";
    }
}
