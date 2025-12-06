package ExamenPoo;

public class Menu {

    private int Id;
    private String Nombre;
    private double Precio;     
    

    public Menu (int Id, String Nombre, double Precio){
    this.Id = Id;
    this.Nombre = Nombre;
    this.Precio = Precio;
    }

    public String obtenerDetalles(){
        return " Id:" + Id + " Nombre: " + Nombre + " Precio: $ " + Precio;

    }


    public int getId(){
        return Id;
    }

    public void setid(int Id){
        this.Id = Id;
    }

    public String getNombre(){
        return Nombre;
    }

    public void setNombre( String Nombre){
        this.Nombre=Nombre;
    }


    public double getPrecio(){
        return Precio;
    }

    public void Precio(double Precio){
        this.Precio=Precio;
    }


}    