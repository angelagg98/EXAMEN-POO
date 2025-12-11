package GestiondeEnvios;

public class EnvioInternacional extends Envio{

    private double ImpuestoAduana;

    public EnvioInternacional( String codigo, String destinario, double costoBase, double ImpuestoAduana ){
        super (codigo,destinario,costoBase);
        this.ImpuestoAduana=ImpuestoAduana;
    }

       @Override
    public String ObtenerDetalle(){
            String resultado = super.ObtenerDetalle();
            resultado += ImpuestoAduana;
            return resultado;
        }

}
