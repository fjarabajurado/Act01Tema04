public class Familia {
    Persona fam[];
    int miembros;

    // crea un objeto Familia si no se pasan parámetros
    public Familia(){
        this.fam = new Persona[10];    
        this.miembros = 0;        
    }

    // crea un objeto familia a partir de una persona
    public Familia(Persona p1){
        this.fam = new Persona[10];
        this.miembros = 1;
        fam[0] = new Persona(p1.getNombre(), p1.getEdad())   ;    
    }

    // crea un objeto familia a partir de un array de personas
    public Familia(Persona p1[]){
        // si hay menos de 10 personas crea una familia de 10. En caso contrario del número de personas
        if (p1.length <= 10){
            this.fam = new Persona[10];                        
        } else {
            this.fam = new Persona[p1.length];            
        }  
        this.miembros = p1.length;
        for (int i = 0; i < p1.length; i++){
            fam[i] = new Persona(p1[i].getNombre(), p1[i].getEdad());
        }   
    }

    // Devuelve un String con los miembros de la familia
    public String toString(){
        String salida = "";
        if (this.miembros == 0) 
            salida = "No hay miembros en la familia";
        else {
            for (int i = 0; i < this.miembros; i++){
                salida += this.fam[i].getNombre() + " - " + this.fam[i].getEdad() + "\n";
            }
        }
        

        return salida;
    }

    // Añade una persona a la familia si hay espacio
    public void add(Persona p) {
         if (this.miembros == this.fam.length){
            System.out.println("Familia Completa");
         } else {
            this.fam[this.miembros] = p;
            this.miembros++;
         }
    }
    
}
