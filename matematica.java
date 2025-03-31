
public class matematica {
    public static final double PI = 3.1415926535;
    public static final double E = 2.7182818284;
    public static final double PHI = 1.6180339887;

    public int soma(int a, int b) {
        return a + b;
    }

    public int multiplica(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        matematica mat = new matematica();
        System.out.println("Número PI: " + PI);
        System.out.println("Número E: " + E);
        System.out.println("Número PHI: " + PHI);
        System.out.println("Soma: " + mat.soma(5, 3));
        System.out.println("Multiplicação: " + mat.multiplica(5, 3));
    }
}
