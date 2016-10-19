package boletin4_4;
public class Pulpo {
    private int pulpo, patatas; //Declaramos las variables y las encapsulamos
    //Metodos constructores que inicializan los valores de los atributos
    public Pulpo(){ 
        pulpo = 0;
        patatas = 0;
    }
    public Pulpo(int pu, int pa){
        pulpo = pu;
        patatas = pa;
    }
    public void numClientes(int pu, int pa){ //Creamos un metodo que devuelve el numero de comensales posibles
        if (pu / 2 > pa) System.out.println(3 * pu / 2);
        else System.out.println(3 * pa);
    }
    public void setPulpo(int x){ //Creamos un metodo que incrementa las unidades de pulpo
        pulpo += x;
    }
    public void setPatatas(int x){ //Creamos un metodo que incrementa las unidades de patatas
        patatas += x;
    }
    public void getPulpo(){ //Creamos un metodo que devuelve las unidades de pulpo
        System.out.println("La cantidad de pulpo es: " + pulpo + " Kg");
    }
    public void getPatatas(){ //Creamos un metodo que devuelve las unidades de patatas
        System.out.println("La cantidad de patatas es: " + patatas + " Kg");
    }
}
