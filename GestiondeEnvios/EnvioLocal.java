package GestiondeEnvios;

public class EnvioLocal extends Envio{

    private int distanciaKm;

    public EnvioLocal( String codigo, String destinario, double costoBase, int distanciaKm ){
        super (codigo,destinario,costoBase);
        this.distanciaKm = distanciaKm;
    }


    @Override
    public String ObtenerDetalle(){
            String resultado = super.ObtenerDetalle();
            resultado += distanciaKm;
            return resultado;
        }
    







}
