package application;

import entities.nota;
import java.util.Locale;
import java.util.Scanner;

public class aluno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        nota x, y;
        x = new nota();
        y = new nota();

        System.out.println("Informe o nome do aluno: ");
        y.name = x.name = sc.nextLine();

        System.out.println("Informe a nota da 1ª prova do 1ºtrimestre: ");
        x.n1 = sc.nextDouble();
        System.out.println("Informe a nota da 2ª prova do 1ºtrimestre: ");
        x.n2 = sc.nextDouble();
        System.out.println("Informe a nota da 3ª prova do 1ºtrimestre: ");
        x.n3 = sc.nextDouble();
        System.out.println("1ºtrimestre: " + x);

        System.out.println("Informe a nota da 1ª prova do 2ºtrimestre: ");
        y.n1 = sc.nextDouble();
        System.out.println("Informe a nota da 2ª prova do 2ºtrimestre: ");
        y.n2 = sc.nextDouble();
        System.out.println("Informe a nota da 3ª prova do 2ºtrimestre: ");
        y.n3 = sc.nextDouble();
        System.out.println("2ºtrimestre: " + y);

        sc.close();
    }
}
