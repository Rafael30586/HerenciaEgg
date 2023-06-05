package entidades;

import java.util.Scanner;

public class Televisor extends Electrodomestico{
    private int resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
    }


    public Televisor(double precio, String color, char consumoEnergetico, double peso, int resolucion, boolean sintonizadorTDT) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor crearTelevisor(){
        System.out.println("Datos del televisor: ");
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        char respuesta='r';
        Electrodomestico electrodomestico = super.crearElectrodomestico();
        Televisor televisor = new Televisor();

        televisor.setConsumoEnergetico(electrodomestico.getConsumoEnergetico());
        televisor.setColor(electrodomestico.getColor());
        televisor.setPeso(electrodomestico.getPeso());
        System.out.println("Resolucion: ");
        televisor.setResolucion(entrada.nextInt());

        while(respuesta!='n'&&respuesta!='s'){
            System.out.println("Sintonizador TDT? (s/n)");
            respuesta = entrada.next().toLowerCase().charAt(0);
        }

        if(respuesta=='s'){
            televisor.setSintonizadorTDT(true);
        }else{
            televisor.setSintonizadorTDT(false);
        }

        televisor.precioFinal();

        return televisor;
    }

    @Override
    public void precioFinal(){
        super.precioFinal();

        if(this.isSintonizadorTDT()){
            this.setPrecio(this.getPrecio()+500);
        }

        if(this.getResolucion()>40){
            this.setPrecio(this.getPrecio()*1.3);
        }
    }

    @Override
    public String toString() {
        return "Televisor{" +
                "resolucion=" + resolucion +
                ", sintonizadorTDT=" + sintonizadorTDT +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }
}
