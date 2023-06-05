public abstract class FormaGeometrica {
    protected double perimetro;
    protected double area;

    public FormaGeometrica() {
    }

    public FormaGeometrica(double perimetro, double area) {
        this.perimetro = perimetro;
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
