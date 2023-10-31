package application;

import java.util.Locale;
import java.util.Scanner;
import entities.CurrencyConverter;

public class compra {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CurrencyConverter cc = new CurrencyConverter();

        System.out.println("What is the dollar price?");
        cc.dollar = sc.nextDouble();
        System.out.println("how many dollars will be bought?");
        cc.valor = sc.nextDouble();
        System.out.printf("Amout to be paid in reais = %.2f", cc.valor_convert());

        sc.close();
    }
}
