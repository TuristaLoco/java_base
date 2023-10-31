package entities;

public class nota {
    public String name;
    public double n1;
    public double n2;
    public double n3;

    public double final_grade(){
        return (n1+n2+n3);
    }

    public String toString(){
        if(final_grade() >= 60){
            return "FINAL GRADE = "
                    + String.format("%.2f", final_grade())
                    + "\n PASS";

        }
        else{
            return "FINAL GRADE = "
                    + String.format("%.2f", final_grade())
                    + "\n FAIL"
                    + "\n MISSING "
                    + (60.00 - final_grade())
                    + " POINTS";
        }
    }
}
