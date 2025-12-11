

public class salaTradicional extends Reserva {

    private int duracionMin;


    public salaTradicional( String codigo, String nombrePelicula , double costoBase, int duracionMin){
        super(codigo,nombrePelicula,costoBase);
        this.duracionMin = duracionMin;
    }

    public int getDuracionMin(){
        return duracionMin;
    }

  
    
     @Override
     public String obtenerDetalles(){
        String resultado = super.obtenerDetalles();
        resultado += " Duracion " + duracionMin +  " min ";
        return resultado;
   }

   @Override
   public double calculaCostoTotal(){
    return getcostoBase();
   }


}

