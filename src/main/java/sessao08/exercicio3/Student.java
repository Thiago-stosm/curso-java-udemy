package sessao08.exercicio3;

public class Student {

    public String name;
    public double grade1;
    public double grade2;
    public double grade3;
    public boolean pass = false;

    public double finalGrade(double grade1, double grade2, double grade3){
        double finalGrade = grade1 + grade2 + grade3;
        return finalGrade;
    }

}
