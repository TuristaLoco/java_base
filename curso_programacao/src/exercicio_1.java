import java.util.Locale;

public class exercicio_1 {
    public static void main(String[] args){
        String product1 = "Computer";
        String product2 = "Office Desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("Products:");
        System.out.printf("%n%s, which price is $ %.2f", product1, price1);
        System.out.printf("%n%s, which price is $ %.2f", product2, price2);
        System.out.printf("%n%nRecord: %d years old, code %s and gender: %c", age, code, gender);
        System.out.printf("%n%nMeasure with eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("Us decimal point: %.3f%n", measure);
    }
}