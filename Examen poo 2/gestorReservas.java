

public class gestorReservas {

   private Reserva [] reservas;
    private int contador;

    public gestorReservas(int tamaño){
        reservas = new Reserva[tamaño];
        contador = 0;
    }

    public int getContador (){
        return contador;
    }
    public void setContador (int contador){
        this.contador = contador;
    }
    
    public void agregarReserva(Reserva r){
        if (contador < reservas.length ) {
            reservas[contador] = r;
            contador++;
            System.out.println(" reserva gregada con exito ");
        }else{
            System.out.print(" no hay mas reservas");
        }
    }
    public Reserva [] getReservas(){
        return reservas;
    }
}