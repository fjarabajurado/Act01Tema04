public class Persona {
    String nombre;
    int edad;
    public Persona (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre(){
        return  this.nombre;
    }

    public int getEdad(){
        return  this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad (int edad){
        this.edad = edad;
    }

    public String toString(){
        String salida;
        salida = this.nombre + " - " + this.edad;
        return  salida;
    }
    
}

