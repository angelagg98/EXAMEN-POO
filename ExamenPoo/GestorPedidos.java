package ExamenPoo;


public class GestorPedidos {
    public static void main(String[] args) {

        
        
    Menu[] menusDia = new Menu[4];

        Menu plato1 = new PlatoComida(1, " sancocho ", 30000, false );
        Menu plato2 = new PlatoComida(2, " bandeja paisa ", 35000, false );
        Menu bebida1 = new  Bebida(1, " Gaseosa ", 5000, 500);
        Menu bebida2 = new  Bebida(1, " limonada ", 3000, 250);

        menusDia[0] = plato1;
        menusDia[1] = plato2;
        menusDia[2] = bebida1;
        menusDia[3] = bebida2;


    }

}
