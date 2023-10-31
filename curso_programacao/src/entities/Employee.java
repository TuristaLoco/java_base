package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;
    public double porc=0;

    public double liquid(){
        return grossSalary - tax;
    }

    public String toString(){
        return "Employee: "
            + name 
            + ", $ "
            + String.format("%.2f", increase());
    }

    public double increase(){
        return (liquid()+(grossSalary*(porc/100)));
    }
}