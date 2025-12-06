package ExamenPoo2;


public class Main2 {
    public static gestorReservas gestor;

    public static void main(String[] args) {
     

        gestorReservas reservaUno = new gestorReservas(4);

        salaTradicional uno  = new salaTradicional("terror", "It", 20000, 0);
        salaTradicional dos = new salaTradicional ("accion", " los indestructible ", 22000, 120);
        sala3D tres = new sala3D(" Animadas ", " los increibles ", 30000, 5000);
        sala3D cuatro = new sala3D(" Animes ", " Inuyasha " , 30000, 5000);

        reservaUno.agregarReserva(uno);
        reservaUno.agregarReserva(dos);
        reservaUno.agregarReserva(tres);
        reservaUno.agregarReserva(cuatro);

        Reserva[] reservas = gestor.getReservas();

    

            for(int i = 0; i < gestor.getContador();i++){
                System.out.println(reservas[i].obtenerDetalles());
            }

            double total = 0.0;

            for(Reserva r: gestor.getReservas()){
                if (r != null) {
                    System.out.println(r.obtenerDetalles());
                    total +=r.calculaCostoTotal();
                    
                }
            }

            System.out.println( " el costo total es : " + total);
        

        


       }   

}
