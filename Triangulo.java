public class Triangulo {
    double ladoA;
    double ladoB;
    double ladoC;
    public Triangulo(double lado){
        this.ladoA = lado;
        this.ladoB = lado;
        this.ladoC = lado;
    }    
public Triangulo(double a, double b, double c) {
    if (!validaTriangulo(a,b,c)){
        throw new IllegalArgumentException("Os Valores Informados não formam um triangulo");
    }
    this.ladoA = a;
    this.ladoB = b;
    this.ladoC = c;
}
 private boolean validaTriangulo(double a, double b, double c){
    return (a+b>c) && (a+c>b) && (b+c>a);
 }
public String tipoTriangulo(){
    if (ladoA == ladoB && ladoB == ladoC){
        return "Equilátero";
    } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC){
        return "Isósceles";
    } else {
        return "Escaleno";
    }
}

@Override
public String toString (){
    return String.format("a: %.2f\nb: %.2f\nc: %.2f", this.ladoA, this.ladoB, this.ladoC);
}
public static void main(String[] args){
    Triangulo trianEquilatero = new Triangulo (5);
    Triangulo trianIsoscales = new Triangulo (5,5,7);
    Triangulo trianEscaleno = new Triangulo(3,25,26);

    System.out.println(trianEquilatero);
    System.out.println(trianIsoscales);
    System.out.println(trianEscaleno);
}
}
