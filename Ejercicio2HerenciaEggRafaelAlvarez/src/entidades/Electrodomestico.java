package entidades;

import java.util.Locale;
import java.util.Scanner;

public class Electrodomestico { //Hice dos pruebas y funciona, habria que hacer mas pruebas por las dudas
    protected double precio=1000;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private void comprobarConsumoEnergetico(char consumoEnergetico){
        switch(consumoEnergetico){
            case 'A': this.setConsumoEnergetico('A');break;
            case 'B': this.setConsumoEnergetico('B');break;
            case 'C': this.setConsumoEnergetico('C');break;
            case 'D': this.setConsumoEnergetico('D');break;
            case 'E': this.setConsumoEnergetico('E');break;
            case 'F': this.setConsumoEnergetico('F');break;
            default: this.setConsumoEnergetico('F');break;
        }
    }

    private void comprobarColor(String color){
        color = color.toUpperCase(Locale.ROOT);
        if(color.equals("BLANCO")){
            this.setColor("BLANCO");
        }else if(color.equals("NEGRO")){
            this.setColor("NEGRO");
        }else if(color.equals("ROJO")){
            this.setColor("ROJO");
        }else if(color.equals("AZUL")){
            this.setColor("AZUL");
        }else if(color.equals("GRIS")){
            this.setColor("GRIS");
        }else{
            this.setColor("BLANCO");
        }

    }

    public Electrodomestico crearElectrodomestico(){
        Electrodomestico electrodomestico = new Electrodomestico();
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");

        //electrodomestico.setPrecio(1000);
        System.out.println("Color: ");
        electrodomestico.comprobarColor(entrada.next());
        System.out.println("Consumo energetico: ");
        electrodomestico.comprobarConsumoEnergetico(entrada.next().toUpperCase().charAt(0));
        System.out.println("Peso: ");
        electrodomestico.setPeso(entrada.nextDouble());

        return electrodomestico;
    }

    public void precioFinal(){
        char consumo = this.getConsumoEnergetico();

        switch(consumo){
            case 'A': this.setPrecio(this.getPrecio()+1000);break;
            case 'B': this.setPrecio(this.getPrecio()+800);break;
            case 'C': this.setPrecio(this.getPrecio()+600);break;
            case 'D': this.setPrecio(this.getPrecio()+500);break;
            case 'E': this.setPrecio(this.getPrecio()+300);break;
            case 'F': this.setPrecio(this.getPrecio()+100);break;
        }

        if(this.getPeso()>=1 && this.getPeso()<=19){
            this.setPrecio(this.getPrecio()+100);
        }else if(this.getPeso()>=20 && this.getPeso()<=49){
            this.setPrecio(this.getPrecio()+500);
        }else if(this.getPeso()>=50 && this.getPeso()<=79){
            this.setPrecio(this.getPrecio()+800);
        }else {
            this.setPrecio(this.getPrecio()+1000);
        }
    }

}

