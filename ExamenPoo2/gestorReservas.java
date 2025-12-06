package ExamenPoo2;

public class gestorReservas {

   private Reserva[] reservas;
   private int contador;

   public void gestorReservas( int tamaño ){
      reservas = new Reserva[tamaño];
      contador=0;
   }

   public void agregarReserva(Reserva r){
      if (contador < reservas.length){
         reservas [contador]=r;
         contador++;
      }else {
         System.out.println(" capacidad lleno ");

      }

      public Reserva[] getReservas(){
         return reservas;

      }


   






    

}
