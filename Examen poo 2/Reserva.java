
public class Reserva {

    private String codigo;
    private String nombrePelicula;
    private double costoBase;

    public Reserva (String codigo,String nombrePelicula, double costoBase){
        this.codigo = codigo;
        this.nombrePelicula = nombrePelicula;
        this.costoBase = costoBase; 
    }


     public double calculaCostoTotal(){
        return costoBase;
    }

    public String obtenerDetalles(){
        String resultado = " codigo " + codigo + " nombre Pelicula " + nombrePelicula + " costo Base " + costoBase;
        return resultado;
    
    }

   
    public String getcodigo(){
        return codigo;
    }

    public void setcodigo(String codigo){
        this.codigo = codigo;
    }


    public String getnombrePelicula(){
        return nombrePelicula;
    }

    public void setnombrePelicula( String nombrePelicula){
        this.nombrePelicula = nombrePelicula;
    }


    public double getcostoBase(){
        return costoBase;
    }


    public void setcostoBase( double costoBase){
        this.costoBase = costoBase;
    }


    



}
