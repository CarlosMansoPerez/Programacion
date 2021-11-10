public class Ej1{
  public static void main(String[]args){
  
  /*Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también 
  la suma total (los puntos que suman entre los tres dados)*/
  
  int tiradaDado;
  int suma=0;
  String tecla;
  
  System.out.println("Vamos a tirar 3 dados ");
  System.out.print("Inserte cualquier tecla para iniciar el programa: ");
  tecla=System.console().readLine();
  
  for(int i=0;i<3;i++) {
    tiradaDado=(int) (Math.random() *6) +1;
    System.out.print(tiradaDado+" ");
    suma=tiradaDado+suma;
  }
  
  System.out.println();
  System.out.print("La suma total de la tirada de los 3 dados es de "+suma);
  
  }
}
