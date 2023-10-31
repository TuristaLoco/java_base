package application;

import java.util.Locale;
import java.util.Scanner;
import entities.VetorNegativos;

public class ProductVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();

        VetorNegativos[] vect = new VetorNegativos[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero:");
            int number = sc.nextInt();

            vect[i] = new VetorNegativos(number);
        }
        System.out.println("Numeros Negativos: ");
        for (int i = 1; i <= n; i++) {
            if (vect[i].getNumber() + Math.abs(vect[i].getNumber()) == 0) {
                System.out.printf("%d\n", vect[i].getNumber());
            }

        sc.close();
        }
    }
}