package GestiondeEnvios;


public class GestorEnvios {

    private Envio[] envios;
    private int contador;


    public GestorEnvios(int tamaño){
        envios = new Envio[tamaño];
        contador = 0;
    }

       public int getContador (){
        return contador;
    }
    public void setContador (int contador){
        this.contador = contador;
    }


    public void agregarEnvio(Envio e){
        if (contador < envios.length ) {
            envios[contador]= e;
            contador++;
            System.out.println(" Envio exitoso ");
        }else{
            System.out.print(" El envio no ha sido registrado ");
        }
    }
    public Envio[] getenvios(){
        return envios;
    }

    }

    


