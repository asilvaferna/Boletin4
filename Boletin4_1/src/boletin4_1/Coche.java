package boletin4_1;


    public class Coche {
        private int velocidad;
    public Coche(int v){
        velocidad = v;
    }
    public Coche(){
        velocidad =0;
    }
    public int getVelocidad(){
        return velocidad;   
    }
    public void acelerar(int valor){
        velocidad += valor;
        System.out.println(velocidad);
    }
    public void frenar (int menos){
        velocidad -= menos;
        System.out.println(velocidad);
    }
    
}