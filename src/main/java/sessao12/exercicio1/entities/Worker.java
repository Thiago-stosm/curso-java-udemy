package sessao12.exercicio1.entities;

import sessao12.exercicio1.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(String workerName, String workerLevel, double baseSalary, String departmentName){
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setLevel(WorkerLevel level){
        this.level = level;
    }
    public WorkerLevel getLevel(){
        return this.level;
    }
    public void setBaseSalary(Double baseSalary){
        this.baseSalary = baseSalary;
    }
    public Double getBaseSalary(){
        return this.baseSalary;
    }
    public void setDepartment(Department department){
        this.department = department;
    }
    public Department getDepartment(){
        return this.department;
    }

    public void addContract(HourContract contract){
        this.contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        this.contracts.remove(contract);
    }

    public Double income(int year, int month){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for(HourContract c : contracts){
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if (year == c_year && month == c_month){
                sum += c.totalValue();
            }
        }
        return sum;
    }

}
