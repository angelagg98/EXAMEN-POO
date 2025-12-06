package ExamenPoo;

public class PlatoComida extends Menu{

    private boolean esVegetariano;

    public PlatoComida(int Id, String Nombre, double Precio, boolean esVegetariano){
        super(Id,Nombre,Precio);
        this.esVegetariano = esVegetariano;
    }

    @Override
    public String obtenerDetalles(){
         return " Id:" + getId() + " Nombre: " + getNombre() + " Precio: $ " + getPrecio() + " es vegetariano " + esVegetariano;
 }
      


   

}


    