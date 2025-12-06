package ExamenPoo2;

public class salaTradicional extends Reserva {

    private int duracionMin;


    public salaTradicional( String codigo, String nombrePelicula , double costoBase, int duracionMin){
        super(codigo,nombrePelicula,costoBase);
        this.duracionMin = duracionMin;
    }
    
     @Override
     public String obtenerDetalles(){
     return " codigo " + getcodigo() + " nombre pelicula " + getnombrePelicula() + " costo base " + getcostoBase() +  " duracion en minutos " +  duracionMin;
     
   }

}

