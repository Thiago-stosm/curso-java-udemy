package sessao13.exercicio3.entities;

public class Company extends TaxPayer{

    private Integer numberOfEmployees;

    public Company(){
    }

    public Company(String name, Double annualIncome, Integer numberOfEmployees){
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax(){
        double basicTax = numberOfEmployees>10?getAnnualIncome()*0.14:getAnnualIncome()*0.16;
        if(basicTax < 0.0) {
            basicTax = 0;
        }
        return basicTax;
    }
}

