package application;

import entities.HeightAge;

import java.util.Locale;
import java.util.Scanner;

public class ProgramHeight {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas?");
        int n = sc.nextInt();
        HeightAge vect[] = new HeightAge[n];

        for(int i=0;i<n;i++){
            System.out.println("Dados da "+ (i+1) +"a pessoa:");
            System.out.println("Nome: ");
            String name = sc.next();
            System.out.println("Idade: ");
            int age = sc.nextInt();
            System.out.println("Altura: ");
            double height = sc.nextDouble();

            vect[i] = new HeightAge(name, age, height);
        }

        double sumHeight = 0;
        double avgHeight = 0;
        int minors = 0;
        double qntMinors = 0;

        for(int i=0;i<n;i++) {
            sumHeight += vect[i].getHeight();
            if(vect[i].getAge() < 16){
                minors ++;
            }
            if(i+1 == vect.length){
                avgHeight = sumHeight/ vect.length;
                System.out.printf("\n Altura média: %.2f", avgHeight);
                qntMinors = ((double)minors/vect.length)*100;
                System.out.printf("\n Pessoas com menos de 16 anos: %.2f%% \n", qntMinors);
            }
        }
        for(int i=0;i<n;i++) {
            if(vect[i].getAge() < 16){
                System.out.println(vect[i].getName());
            }
        }

        sc.close();
    }
}
