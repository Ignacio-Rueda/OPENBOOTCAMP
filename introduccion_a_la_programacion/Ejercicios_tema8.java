/*
Para practicar la encapsulación:

Crear clase Persona.

Crear variables las privadas edad, nombre y telefono de la clase Persona.

Crear gets y sets de cada propiedad.

Crear un objeto persona en el main.

Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.


 */
public class Ejercicios_tema8 {

    public static void main(String[] args) {
        Persona P_numero1 = new Persona();
        P_numero1.setEdad(18);
        P_numero1.setNombre("Juan");
        P_numero1.setTelefono(666285976);
        
        System.out.println("EDAD: "+P_numero1.getEdad()+" NºTELÉFONO: "+P_numero1.getTelefono()+" NOMBRE: "+P_numero1.getNombre());
    }
}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;
    
    public Persona(){
        this.edad=0;
        this.nombre="";
        this.telefono=0;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public int getTelefono(){
        return this.telefono;
    }
    public void setTelefono(int telefono){
        this.telefono=telefono;
    }
    
    
}
