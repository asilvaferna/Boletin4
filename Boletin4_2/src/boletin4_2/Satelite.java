package boletin4_2;
public class Satelite {
    //Declaramos los atributos y los encapsulamos
    private double meridiano; 
    private double paralelo;
    private double distanciaTierra;
    //Creamos dos metodos constructores que inicializan los valores de los atributos
    public Satelite(){
        meridiano = paralelo = distanciaTierra = 0;
    }
    public Satelite (double m, double p, double d){
        meridiano = m;
        paralelo = p;
        distanciaTierra = d;  
    }
    public void verPosicion(){ //Metodo para visualizar la posicion del satelite
        System.out.println("El satelite se encuentra en el paralelo" + paralelo + " meridiano " + meridiano + " y a una distacia de la tierra " + distanciaTierra);
    }
}
