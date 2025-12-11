


public class Main2 {

    public static void main(String[] args) {
     

        gestorReservas reservaUno = new gestorReservas(4);

        salaTradicional uno  = new salaTradicional("uno", "It", 20000, 0);
        salaTradicional dos = new salaTradicional ("dos", " los indestructible ", 22000, 120);
        sala3D tres = new sala3D(" tre ", " los increibles ", 30000, 5000);
        sala3D cuatro = new sala3D(" cuatro ", " Inuyasha " , 30000, 5000);

        reservaUno.agregarReserva(uno);
        reservaUno.agregarReserva(dos);
        reservaUno.agregarReserva(tres);
        reservaUno.agregarReserva(cuatro);

        Reserva[] reservas = reservaUno.getReservas();

            System.out.println( " lista de reservas: ");

            for(int i = 0; i < reservaUno.getContador();i++){
                System.out.println(reservas[i].obtenerDetalles());
            }

            System.out.println( " calculo total: ");
            double total = 0.0;

            for(Reserva r: reservaUno.getReservas()){
                if (r != null) {
                    System.out.println(r.obtenerDetalles());
                    total +=r.calculaCostoTotal();
                    
                }
            }

            System.out.println( " el costo total es : " + total);
        

        


       }   

}
