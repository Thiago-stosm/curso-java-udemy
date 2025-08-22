package sessao13.exercicio1.application;

import sessao13.exercicio1.entities.Employee;
import sessao13.exercicio1.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Program{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.println("Enter the number of employees: ");
        int roles = sc.nextInt();

        for(int i=0; i<roles; i++){

            System.out.printf("Employee #%d data: ", i+1);
            System.out.println("Outsourced (y/n?): ");
            String answer = sc.next();
            System.out.println("Name: ");
            String name = sc.next();
            System.out.println("Hours: ");
            int hour = sc.nextInt();
            System.out.println("Value per hour: ");
            Double valuePerHour = sc.nextDouble();

            if(answer.equals("y")){
                System.out.print("Additional charge: ");
                Double additionalCharge = sc.nextDouble();
                Employee employee = new OutsourcedEmployee(name, hour, valuePerHour, additionalCharge);
                employees.add(employee);
            }else{
                Employee employee = new Employee(name, hour, valuePerHour);
                employees.add(employee);
            }
        }

        System.out.print("PAYMENTS: ");
        for(Employee employee : employees){
            System.out.print(employee.getName() + " -  $ " + employee.payment() + "\n");
        }
    }
}
