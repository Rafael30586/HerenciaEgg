public class Main {
    public static void main(String[] args) {
        Circulo ci1 = new Circulo(23);
        Rectangulo rec1 = new Rectangulo(34,76);
        ci1.calcularArea();
        ci1.calcularPerimetro();
        rec1.calcularArea();
        rec1.calcularPerimetro();

        System.out.println("Area del circulo: "+ci1.getArea());
        System.out.println("Perimetro del circulo: "+ci1.getPerimetro());
        System.out.println("Area del rectangulo: "+rec1.getArea());
        System.out.println("Perimetro del rectangulo: "+rec1.getPerimetro());

        //System.out.println("Hello world!");
    }

}