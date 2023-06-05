

public class Rectangulo extends FormaGeometrica implements CalculosFormas{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularPerimetro() {
        super.setPerimetro(base*2+altura*2);
        return (base*2+altura*2);
    }

    @Override
    public double calcularArea() {
        super.setArea(base*altura);
        return base*altura;
    }
}
