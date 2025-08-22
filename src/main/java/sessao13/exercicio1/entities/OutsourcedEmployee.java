package sessao13.exercicio1.entities;

public class OutsourcedEmployee extends Employee{

    private Double additionalCharge;

    public OutsourcedEmployee(){
        super();
    }

    public OutsourcedEmployee(String name, Integer hour, Double valuePerHour, Double additionalCharge){
        super(name, hour, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment(){
        return super.payment()+this.additionalCharge *1.10;
    }
}
