package ExamenPoo;

import java.util.Scanner;

public class MainExamen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        
        
        GestorPedidos mesa1 = new GestorPedidos();

        PlatoComida p1 = new PlatoComida(1,"bandeja paisa", 30000, false);
        PlatoComida p2 = new PlatoComida (2, "sancocho", 25000, false);
        Bebida b1 = new Bebida(3, " gaseosa ", 5000, 500);
        Bebida b2 = new Bebida(4, " limonada", 2000, 250);

        mesa1.agregarItem(p1);
        mesa1.agregarItem(p2);
        mesa1.agregarItem(b1);
        mesa1.agregarItem(b2);

        double precioTotal=0;

        int platocount = 0;
        int bebidascount = 0;

        /*//foreach arraylist
        for (Menu item : mesa1.getlistaPedidos()) {

            System.out.println("lista arraylist");
            System.out.println(item.obtenerDetalles());
            precioTotal = precioTotal + item.getPrecio();
        
        }*/ 

        System.out.println("cantidad de bebidas la mesa : " + bebidascount);
        System.out.println(" cantidad de platos de la mesa : " + platocount);

        System.out.println(" el valor  a pagar es : " + precioTotal);

        //array
         for (int i=0; i<mesa1.getlistaPedidos().size() ; i++) {
            System.out.println("lista array");
            System.out.println(mesa1.getlistaPedidos().get(i).obtenerDetalles());
        }
        

    }
       

}
