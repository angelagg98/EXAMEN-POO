package ExamenPoo2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        gestorReservas reservaUno = new gestorReservas();

        salaTradicional uno  = new salaTradicional("terror", "It", 20000, 0);
        salaTradicional dos = new salaTradicional ("accion", " los indestructible ", 22000, 120);
        sala3D tres = new sala3D(" Animadas ", " los increibles ", 30000, 5000);
        sala3D cuatro = new sala3D(" Animes ", " Inuyasha " , 30000, 5000);

        reservaUno.gestorReservas(uno);
        reservaUno.gestorReservas(dos);
        reservaUno.gestorReservas(tres);
        reservaUno.gestorReservas(cuatro);

        double valorLentes = 0;
        int duracionMin = 0;

        System.out.println( " reservas" + );

        for ( int i = 0,  i<gestorReservas, i++ );{
            System.out.println( " cantidad de reservass " +  gestorReservas);


        }
       }   

}
