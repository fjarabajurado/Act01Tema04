public class App {
    public static void main(String[] args) throws Exception {
        Persona carmen = new Persona("Carmen Pérez", 34);
        Persona luisa = new Persona ("Luisa Segarra", 52);
        Familia fam = new Familia(carmen);
        System.out.println("La edad de luisa es: " + luisa.getEdad());

        System.out.println(carmen.toString());
        System.out.println(luisa.toString());

        System.out.println("Medida " + carmen.getNombre() + " = " + carmen.largoNombre());
        System.out.println("Medida " + luisa.getNombre() + " = " + luisa.largoNombre());

        // muestra la familia
        System.out.println("\nFamilia");
        System.out.println(fam.toString());
        

        fam.add(luisa);
        fam.add(new Persona("Frank de la Jungla", 48));
        System.out.println(fam.toString());

        OtraClase mia = new OtraClase();
        


    }
}
