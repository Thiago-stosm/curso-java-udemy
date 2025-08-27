package sessao13.exercicio3.entities;

public class Individual extends TaxPayer {

    private Double healthExpends;

    public Individual(){
    }

    public Individual(String name, Double annualIncome, Double healthExpends){
        super(name, annualIncome);
        this.healthExpends = healthExpends;
    }

    @Override
    public double tax(){
        double basicTax = getAnnualIncome() > 20000.00? getAnnualIncome()*0.25 : getAnnualIncome()*0.15;
        if(basicTax < 0.0){
            basicTax = 0;
        }else if (healthExpends>0.0){
            basicTax -= healthExpends*0.5;
        }
        return basicTax;
    }
}
