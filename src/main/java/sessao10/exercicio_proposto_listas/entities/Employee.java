package sessao10.exercicio_proposto_listas.entities;

public class Employee {

    private final Integer id;
    private String name;
    private Double salary;

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
    public void increaseSalary(double percentage){
        if (percentage > 0.0) {
            this.salary += salary * (percentage/100);
        }
    }
    public String toString() {
        return "id = " + id + "\nname = " + name + "\nsalary = " + salary ;
    }
}
