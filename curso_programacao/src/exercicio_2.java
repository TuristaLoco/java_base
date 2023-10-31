import java.util.Scanner;
import java.util.Locale;

public class exercicio_2 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double b, c, v, area, preco;
        
        System.out.printf("Digite o comprimento: ");
        c = sc.nextDouble();

        System.out.printf("Digite a largura: ");
        b = sc.nextDouble();

        System.out.printf("Digite o preço do metro quadrado: ");
        v = sc.nextDouble();

        area = b*c;
        preco = area*v;

        System.out.printf("o comprimento: " + c);
        System.out.printf("%n a largura: " + b);
        System.out.printf("%n o preço do metro quadrado: %.2f", v);
        System.out.printf("%n a area: %.2f m²", area);
        System.out.printf("%n o preço do terreno: R$ %.2f", preco);

        sc.close();
    }
}
