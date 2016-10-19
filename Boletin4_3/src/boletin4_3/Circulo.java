package boletin4_3;
public class Circulo {
    private double radio;
    static final double PI = 3.14;
    public Circulo(){
        radio = 0;
    }
    public Circulo(double r){
        radio = r;
    }
    public void calcularArea(){
        System.out.println("El area es: " + PI * (Math.pow(radio, 2)));
    }
    public void calcularLongitud(){
        System.out.println ("La longitud es: " + 2 * PI * radio);
    }
    
}
