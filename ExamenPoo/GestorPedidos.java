package ExamenPoo;

import java.util.ArrayList;

public class GestorPedidos {

  private ArrayList<Menu> listaPedidos = new ArrayList<>();

  public void agregarItem(Menu item){
    listaPedidos.add(item);
  }

  public ArrayList<Menu> getlistaPedidos(){
    return listaPedidos;
  }

  public void setlistaPedidos(ArrayList<Menu> listaPedidos){
    this.listaPedidos = listaPedidos;
  }
  
   
 }


