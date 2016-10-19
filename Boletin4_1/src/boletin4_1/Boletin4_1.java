package boletin4_1;

public class Boletin4_1 {
   
    public static void main(String[] args) {
        Coche c1 = new Coche();
        c1.acelerar(100);
        c1.getVelocidad();
        c1.acelerar(100);
        c1.getVelocidad();
        c1.frenar(20);
        c1.getVelocidad();
    }
    
}
