package sessao10.exercicio_proposto_listas.main;

import sessao10.exercicio_proposto_listas.entities.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>(); // instanciação da lista
        int length;
        int id;
        String name;
        double initialSalary;

        while(true){ // verificação de usuário
            System.out.println("How many employees will be registered?");
            length = Integer.parseInt(sc.nextLine());
            if(length >= 0){
                break;
            }
            else{
                System.out.println("Invalid input");
            }
        }

        for (int i = 0; i < length; i++){
            System.out.printf("Employee #%d\n", i+1);
            while(true){
                System.out.println("Id: ");

                try{
                    id = sc.nextInt();
                    sc.nextLine();

                    boolean idAlreadyExists = false;

                    for(Employee emp : employees){
                        if (emp.getId() == (id)){
                            idAlreadyExists = true;
                            break;
                        }
                    }
                    if (idAlreadyExists == true){
                        System.out.println("This ID is already in use.");
                    }
                    else{
                        break;
                        }
                }
                catch (InputMismatchException e){
                    System.out.println("Invalid input");
                    sc.nextLine();
                }
            }
            System.out.println("Name: ");
            name = sc.next();
            sc.nextLine();
            System.out.println("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            Employee employee = new Employee(id, name, salary);
            employees.add(employee);
        }

        System.out.println("Enter the employee ID that will have the salary increase: ");
        int IncreaseId = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the percent: ");
        double percent = sc.nextDouble();

        for (Employee emp : employees){
            if (emp.getId() == IncreaseId){
                emp.increaseSalary(percent);
            }
        }

        System.out.println("List of employees: ");
        for(Employee e: employees){
            System.out.println(e);
        }
    }
}
