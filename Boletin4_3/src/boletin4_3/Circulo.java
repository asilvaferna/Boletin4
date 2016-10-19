package boletin4_3;
public class Circulo {
    private double radio; //Declaramos variable y la encapsulamos
    static final double PI = 3.14; //Declaramos una constante de tipo double
    //Metodos constructores que inicializan los valores de los atributos
    public Circulo(){
        radio = 0;
    }
    public Circulo(double r){
        radio = r;
    }
    public void calcularArea(){ //Metodo para calcular el area y devolverlo por pantalla
        System.out.println("El area es: " + PI * (Math.pow(radio, 2)));
    }
    public void calcularLongitud(){ //Metodo para calcular la longitud y devolverlo por pantalla
        System.out.println ("La longitud es: " + 2 * PI * radio);
    }
    
}
