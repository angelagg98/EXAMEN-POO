public class sala3D extends Reserva {

    private double valorLentes;


    public sala3D( String codigo, String nombrePelicula, double costoBase, double valorLentes){
        super(codigo, nombrePelicula, costoBase);
        this.valorLentes = valorLentes;
    }

     @Override
   public String obtenerDetalles( ){
    return " codigo " + getcodigo() + " nombre pelicula " + getnombrePelicula() + " costo base " + getcostoBase() + " valor lentes " +  valorLentes 
   }

}
