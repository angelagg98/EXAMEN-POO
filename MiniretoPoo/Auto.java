public class Auto extends Vehiculos {  //hereda automaticamente todos los atributos de la clase padre (herencia)

    public Auto(String marca, String modelo, double velocidad, double combustible){
        super(marca, modelo, velocidad, combustible);           // constructor SUOER: LLAMA AL CONSTRUCTOR DE LA CLASE PADRE
    }

    @Override    // sobreescribir el metodo de la clase padre (POLIMORFISMO)
    public double calcularConsumo(double distancia){
        double rendimiento = 12.0;      // SE SOBREESCRIBE EL CONSUMO DEL ONBUSTIBLE 
        return distancia / rendimiento;
    }
    
}
