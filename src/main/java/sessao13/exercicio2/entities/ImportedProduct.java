package sessao13.exercicio2.entities;

public class ImportedProduct extends Product{

    private Double customsFee;

    public ImportedProduct(){

    }
    public ImportedProduct(String name, Double price, Double customsFee){
        super(name, price);
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag(){
        return getName() + " $" + totalPrice() + "(Customs fee: $" + customsFee + ")";
    }
    public Double totalPrice(){
        return getPrice() + customsFee;
    }
}
