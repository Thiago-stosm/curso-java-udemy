package sessao10.exercicio_proposto_listas.entities;

public class Employee {

    private final int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double initialSalary) {
        this.id = id;
        this.name = name;
        this.salary = initialSalary;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void increaseSalary(double salary, double percentage){
        if (percentage > 0.0) {
            this.salary += salary * percentage;
        }
    }
}
