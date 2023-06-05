public class Main {
    public static void main(String[] args) {

        Animal perro1 = new Perro("Firulais", "carne", 10, "Siberian husky" );
        perro1.alimentarse();

        Animal perro2 = new Perro("Sultan", "balanceado", 8, "Doberman" );
        perro2.alimentarse();

        Animal gato1 = new Gato("Garfield", "lasagna", 11, "Siames" );
        gato1.alimentarse();

        Animal caballo1 = new Caballo("Epoona", "pasto", 12, "Fino" );
        caballo1.alimentarse();

        //System.out.println("Hello world!");
    }
}