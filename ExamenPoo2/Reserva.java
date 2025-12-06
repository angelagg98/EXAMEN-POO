package ExamenPoo2;

public class Reserva {

    private String codigo;
    private String nombrePelicula;
    private double costoBase;

    public Reserva (String coString,String nombrePelicula, double costoBase){
        this.codigo = codigo;
        this.nombrePelicula = nombrePelicula;
        this.costoBase = costoBase; 
    }

    public String obtenerDetalles(){
        return " codigo " + codigo + " nombre Pelicula " + nombrePelicula + " costo Base " + costoBase;
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


    public double setcostoBase(){
        return costoBase;
    }


    public void getcostoBase( double costoBase){
        this.costoBase = costoBase;
    }



}
