package application;

import entities.Account;
import java.util.Locale;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account client;

        char recon;
        System.out.println("Já tem uma conta(y/n)?");
        recon = sc.next().charAt(0);

        if(recon == 'y'){
            System.out.println("Digite o numero da Conta: ");
            int accountNumber = sc.nextInt();

            System.out.println("Digite o nome do titular da Conta: ");
            String name = sc.nextLine();

            System.out.println("Quer depositar alguma quantia de dinheiro?(y/n)");
            recon = sc.next().charAt(0);
            if(recon == 'y'){
                System.out.print("Enter initial deposit value: ");
                double initialDeposit = sc.nextDouble();
                client = new Account(accountNumber, name, initialDeposit);
            }else {
                client = new Account(accountNumber, name);
            }

            System.out.println();
            System.out.println("Detalhes da Conta:");
            System.out.println(client);

            System.out.println();
            System.out.print("Entre o valor de deposito: ");
            double depositValue = sc.nextDouble();
            client.deposit(depositValue);
            System.out.println("Updated account data:");
            System.out.println(client);

            System.out.println();
            System.out.print("Entre o valor de saque: ");
            double withdrawValue = sc.nextDouble();
            client.withdraw(withdrawValue);
            System.out.println("Updated account data:");
            System.out.println(client);

        } else if (recon == 'n') {
            System.out.println("Gostaria de criar uma conta?");

        }else{
            System.out.println("Comando não reconhecido");
        }

        sc.close();
    }
}
