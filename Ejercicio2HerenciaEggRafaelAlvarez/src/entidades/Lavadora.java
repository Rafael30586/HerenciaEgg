package entidades;

import java.util.Scanner;

public class Lavadora extends Electrodomestico{
    private double carga;

    public Lavadora(double precio, String color, char consumoEnergetico, double peso, double carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Lavadora() {
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public Lavadora crearLavadora(){
        System.out.println("Datos de la lavadora: ");
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        Electrodomestico electrodomestico = super.crearElectrodomestico();
        Lavadora lavadora = new Lavadora();
        lavadora.setColor(electrodomestico.getColor());
        lavadora.setPeso(electrodomestico.getPeso());
        lavadora.setConsumoEnergetico(electrodomestico.getConsumoEnergetico());

        System.out.println("Carga: ");
        lavadora.setCarga(entrada.nextDouble());

        lavadora.precioFinal();

        return lavadora;
    }

    @Override
    public void precioFinal(){
        super.precioFinal();
        if(this.getCarga()>30){
            this.setPrecio(this.getPrecio()+500);
        }
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "carga=" + carga +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }
}
