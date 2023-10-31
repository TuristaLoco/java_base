import java.util.Scanner;
import java.util.Locale;

public class input_teclado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;
        char k;

        double result1 = Math.pow(5.0,-5.0);
        double result2 = Math.abs(-5);
        double result3 = Math.sqrt(20);

        x = sc.next();
        // nextLine(), para pular linha; 
        y = sc.nextInt();
        z = sc.nextDouble();
        k = sc.next().charAt(0);

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(k);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        sc.close();
    }
}
