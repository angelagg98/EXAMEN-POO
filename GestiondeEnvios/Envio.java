package GestiondeEnvios;

public class Envio {

    private String codigo;
    private String destinario;
    private double costoBase;

    public Envio ( String codigo, String destinario, double costoBase){
        this.codigo=codigo;
        this.destinario=destinario;
        this.costoBase=costoBase;
    }
        public String ObtenerDetalle(){
            String resultado = " codigo: " +  codigo + " Destinatario: " + destinario + " costo base: " + costoBase;
            return resultado;
    
        }

          public double calculaCostoTotal(){
            return costoBase;
    }







      public String getcodigo(){
        return codigo;
    }

    public void setcodigo(String codigo){
        this.codigo = codigo;
    }


    public String getdestinario(){
        return destinario;
    }

    public void setdestinario(String destinario){
        this.destinario=destinario;
    }


    public double getcostoBase(){
        return costoBase;
    }

    public void setcostoBase(double costoBase){
        this.costoBase=costoBase;
    }






    
}
