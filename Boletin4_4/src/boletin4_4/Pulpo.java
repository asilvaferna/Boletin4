package boletin4_4;
public class Pulpo {
    private int pulpo, patatas;
    public Pulpo(){
        pulpo = 0;
        patatas = 0;
    }
    public Pulpo(int pu, int pa){
        pulpo = pu;
        patatas = pa;
    }
    public void numClientes(int pu, int pa){
        if (pu / 2 > pa) System.out.println(3 * pu / 2);
        else System.out.println(3 * pa);
    }
    public void setPulpo(int x){
        pulpo += x;
    }
    public void setPatatas(int x){
        patatas += x;
    }
    public void getPulpo(){
        System.out.println("La cantidad de pulpo es: " + pulpo + " Kg");
    }
    public void getPatatas(){
        System.out.println("La cantidad de patatas es: " + patatas + " Kg");
    }
}
