package sessao08;

import javax.swing.JOptionPane;

public class Employee {

    private String name;
    private double grossSalary;
    private double tax;

    // Setters
    public void setName(String name){
        this.name = name;
    }
    public void setGrossSalary(double grossSalary){
        this.grossSalary = grossSalary;
    }
    public void setTax(double tax){
        this.tax = tax;
    }

    // Getters
    public String getName(){
        return name;
    }
    public double getGrossSalary(){
        return grossSalary;
    }
    public double getTax(){
        return tax;
    }

    public double netSalary(double grossSalary, double tax){
        double netSalary = grossSalary - (grossSalary * (tax/100));
        return netSalary;
    }

    public double increaseSalary(double grossSalary, double netSalary){
        double increasePercent = Double.parseDouble(JOptionPane.showInputDialog("Which percentage to increase salary?"));
        double newSalary = netSalary + (grossSalary * (increasePercent/100));
        return newSalary;

    }
}

 class Main{
     public static void main (String [] args){

         Employee func = new Employee();

         func.setName(JOptionPane.showInputDialog("NAME"));
         func.setGrossSalary(Double.parseDouble(JOptionPane.showInputDialog("GROSS SALARY")));
         func.setTax(Double.parseDouble(JOptionPane.showInputDialog("TAX")));

         JOptionPane.showMessageDialog(null, String.format("%s, $%.2f", func.getName(), func.netSalary(func.getGrossSalary(), func.getTax())));

         double netSalary = func.netSalary(func.getGrossSalary(), func.getTax());
         double newSalary = func.increaseSalary(func.getGrossSalary(), netSalary);

         JOptionPane.showMessageDialog(null, String.format("Updated data: %s, $%.2f", func.getName(), newSalary));
     }
 }