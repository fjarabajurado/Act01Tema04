public class App {
    public static void main(String[] args) throws Exception {
        Persona carmen = new Persona("Carmen Pérez", 34);
        Persona luisa = new Persona ("Luisa Segarra", 52);
        System.out.println("La edad de luisa es: " + luisa.getEdad());

        System.out.println(carmen.toString());
        System.out.println(luisa.toString());

        Coche c1 = new Coche("AB-5256", 2020, 2000);
        Coche c2 = new Coche("BC-6656", 2018, 2500);

        System.out.println("Coche: " + c1.getMatricula() + " - " + c1.getCilindrada());
        System.out.println("Coche: " + c2.getMatricula() + " - " + c2.getCilindrada());
    }
}
