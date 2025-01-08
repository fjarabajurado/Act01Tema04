public class App {
    public static void main(String[] args) throws Exception {
        Persona carmen = new Persona("Carmen Pérez", 34);
        Persona luisa = new Persona ("Luisa Segarra", 52);
        System.out.println("La edad de luisa es: " + luisa.getEdad());

        System.out.println(carmen.toString());
        System.out.println(luisa.toString());
    }
}
