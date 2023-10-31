package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main_Employee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.println("Informe o nome do funcionario: ");
        emp.name = sc.nextLine();
        System.out.println("Informe o salário bruto: ");
        emp.grossSalary = sc.nextDouble();
        System.out.println("informe a taxa: ");
        emp.tax = sc.nextDouble();

        System.out.println(emp);

        System.out.println("Informe o aumento do salário em %: ");
        emp.porc = sc.nextDouble();

        System.out.println("Atualizado: " + emp);

        sc.close();
    }
}