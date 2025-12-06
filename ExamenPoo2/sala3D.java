public class sala3D extends Reserva {

    private double valorLentes;


    public sala3D( String codigo, String nombrePelicula, double costoBase, double valorLentes){
        super(codigo, nombrePelicula, costoBase);
        this.valorLentes = valorLentes;
    }

    public double getvalorLentes(){
        return valorLentes;
    }


     @Override
   public String obtenerDetalles( ){
        String resultado = super.obtenerDetalles();
        resultado += " valor " + valorLentes;
        return resultado;
   }

   @Override
   public double calculaCostoTotal(){
    return setcostoBase();
   }

}
