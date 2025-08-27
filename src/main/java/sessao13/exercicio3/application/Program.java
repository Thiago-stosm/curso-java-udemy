package sessao13.exercicio3.application;

import sessao13.exercicio3.entities.Company;
import sessao13.exercicio3.entities.Individual;
import sessao13.exercicio3.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> taxPayers = new ArrayList<>();

        System.out.println("Enter the number of tax payers: ");
        int numberOfPayers = sc.nextInt();

        for(int i=0;i<numberOfPayers;i++){
            System.out.printf("Tax payer #%d data%n", i+1);
            System.out.println("Individual or company (i/c)?");
            char answer = sc.next().charAt(0);
            System.out.println("Name: ");
            String name = sc.next();
            System.out.println("Annual Income: ");
            Double annualIncome = sc.nextDouble();

            switch (answer){
                case 'i' -> {
                    System.out.println("Health expenditures: ");
                    double healthExpenditures = sc.nextDouble();
                    Individual individual = new Individual(name, annualIncome, healthExpenditures);
                    taxPayers.add(individual);
                }
                case 'c' -> {
                    System.out.println("Number of Employees: ");
                     int numberOfEmployees = sc.nextInt();
                     Company company = new Company(name, annualIncome, numberOfEmployees);
                     taxPayers.add(company);
                }
            }
        }
        double totalTax=0.0;
        System.out.println("TAXES PAID: ");
        for(TaxPayer taxPayer : taxPayers){
            System.out.printf(taxPayer.getName() + " $ " + taxPayer.tax() +"\n");
            totalTax+=taxPayer.tax();
        }
        System.out.println("TOTAL TAXES: $ " + totalTax);

        sc.close();
    }
}
