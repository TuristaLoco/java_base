//Aula 43, pdf 06-estruturas-repetitivas
import java.util.Locale;
import java.util.Scanner;

public class BreakPoint{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // toggle BreakPoint (F9), Run>toggle BreakPoint
        // Arquivo>debug as Java Application
        // Executar linha (F10), Run>Step Over

        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double metroQuadrado = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO = %.2f%n", preco);

        sc.close(); 
    }
}