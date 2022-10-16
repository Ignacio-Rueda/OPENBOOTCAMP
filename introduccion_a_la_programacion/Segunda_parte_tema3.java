public class Segunda_parte{
    public static void main(String[]args){
        Coche miCoche = new Coche();
        miCoche.AumentarPuertas();
        System.out.println(miCoche.numeroPuertas);
    
    }


}
class Coche{
    public int numeroPuertas=0;
    
    public void AumentarPuertas(){
        this.numeroPuertas++;
    }
}

