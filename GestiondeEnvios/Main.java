package GestiondeEnvios;

public class Main {

    public static void main(String[] args) {
    
    GestorEnvios EnviosListos = new GestorEnvios(4);

    EnvioLocal primero = new EnvioLocal("001", " Bogota ", 30000, 5000);
    EnvioLocal segundo = new EnvioLocal("002", "cali", 20000, 3000);
    EnvioInternacional tercero = new EnvioInternacional("003", " Chile  ", 40000, 30000);
    EnvioInternacional cuarto = new EnvioInternacional("004", " Perú", 20000, 50000);


    EnviosListos.agregarEnvio(primero);
    EnviosListos.agregarEnvio(segundo);
    EnviosListos.agregarEnvio(tercero);
    EnviosListos.agregarEnvio(cuarto);

        Envio [] envios = EnviosListos.getenvios();


        for(int i = 0; i < EnviosListos.getContador();i++){
                System.out.println(envios[i].ObtenerDetalle());
            }

            System.out.println( " calculo total: ");
            double total = 0.0;

            for(Envio e: EnviosListos.getenvios()){
                if (e != null) {
                    System.out.println(e.ObtenerDetalle());
                    total +=e.calculaCostoTotal();
                    
                }
            }

            System.out.println( " el costo total es : " + total);
        

    }


}
