package application;

import entities.Retangle;

import java.util.Locale;
import java.util.Scanner;

public class Main_Retangle {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangle rect = new Retangle();
        System.out.println("Enter retangle width and height: ");
        System.out.println("Width: ");
        rect.width = sc.nextDouble();
        System.out.println("Height: ");
        rect.height = sc.nextDouble();

        System.out.println("Area = " + rect.area());
        System.out.println("Perimeter = " + rect.perimeter());
        System.out.println("Diagonal = " + rect.diagonal());

        sc.close();
    }
}
