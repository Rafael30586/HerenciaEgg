import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Lavadora lv1 = new Lavadora();
        lv1 = lv1.crearLavadora();

        Televisor tv1 = new Televisor();
        tv1 = tv1.crearTelevisor();

        Televisor tv2 = new Televisor();
        tv2 = tv2.crearTelevisor();

        Televisor tv3 = new Televisor();
        tv3 = tv3.crearTelevisor();

        System.out.println(lv1);
        System.out.println(tv1);

        ArrayList<Electrodomestico> electrodomesticos = new ArrayList(4);
        electrodomesticos.add(lv1);
        electrodomesticos.add(tv1);
        electrodomesticos.add(tv2);
        electrodomesticos.add(tv3);

        precios(electrodomesticos);

        //System.out.println("Hello world!");
    }

    //este metdodo corresponde al ejercicio 3
    public static void precios(ArrayList<Electrodomestico> electrodomesticos){
        double precioLavadoras=0;
        double precioTelevisores=0;
        double precioElectrodomesticos=0;

        for(Electrodomestico e : electrodomesticos){
            if(e instanceof Lavadora){
                precioLavadoras += e.getPrecio();
            }else if(e instanceof Televisor){
                precioTelevisores += e.getPrecio();
            }
            precioElectrodomesticos += e.getPrecio();
        }

        System.out.println("Precio de lavadoras: "+precioLavadoras);
        System.out.println("Precio de televisores: "+precioTelevisores);
        System.out.println("Precio de electrodomesticos: "+precioElectrodomesticos);

    }
}