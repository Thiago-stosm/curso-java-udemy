package sessao13.exercicio3.entities;

    public abstract class TaxPayer{

    private String name;
    private Double annualIncome;

    public TaxPayer(){
    }

    public TaxPayer(String name, Double annualIncome){
        super();
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public String getName(){
        return this.name;
    }
    public Double getAnnualIncome(){
        return this.annualIncome;
    }

    public abstract double tax();
}