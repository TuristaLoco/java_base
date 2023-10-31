package entities;

public class CurrencyConverter {
    public Double dollar;
    public Double valor;

    public static final double IOF = 1.06;

    public double valor_convert(){
        return dollar*valor*IOF;
    }

}
