public class Circulo extends FormaGeometrica implements CalculosFormas{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularPerimetro() {
        super.setPerimetro(2*CalculosFormas.PI*radio);
        return 2*CalculosFormas.PI*radio;
    }

    @Override
    public double calcularArea() {
        super.setArea(CalculosFormas.PI*radio*radio);
        return CalculosFormas.PI*radio*radio;
    }
}
