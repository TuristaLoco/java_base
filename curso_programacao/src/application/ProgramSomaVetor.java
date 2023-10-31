package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramSomaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero:");
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        System.out.printf("VALORES: ");
        for (int i=0; i<n; i++) {
            sum += vect[i];
            System.out.printf("%.2f " ,vect[i]);
        }
        System.out.printf("\nSOMA: %.2f", sum);

        double avg = sum / vect.length;
        System.out.printf("\nMEDIA: %.2f", avg);

        sc.close();
    }
}
