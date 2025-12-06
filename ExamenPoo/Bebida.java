package ExamenPoo;

public class Bebida extends Menu {

    private int volumenMl;
    

    public Bebida(int Id, String Nombre, double Precio, int volumenMl){
          super(Id,Nombre,Precio);
             this.volumenMl = volumenMl;
    }

     @Override
    public String obtenerDetalles(){
         return " Id:" + getId() + " Nombre: " + getNombre() + " Precio: $ " + getPrecio() + " su volumen en Ml es: " + volumenMl;
 }
      


}
