package ExamenPoo2;

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
        return 0;
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


    public double setcostoBase(){
        return costoBase;
    }


    public double getcostoBase( double costoBase){
        this.costoBase = costoBase;
    }


    public double calcularCostoTotal() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularCostoTotal'");
    }



}
