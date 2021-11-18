public class Ej6arrays{
  public static void main(String[]args){
  
  /*Escribe un programa que lea 15 números por teclado y que los almacene en un 
  array. Rota los elementos de ese array, es decir, el elemento de la posición 0
  debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en la
  última posición debe pasar a la posición 0. Finalmente, muestra el contenido del array.*/
  
  int []numeroIntroducido=new int[15];
  
  System.out.println("Introduzca 15 números: ");
  
  for(int i=0;i<15;i++) {
    numeroIntroducido[i]=Integer.parseInt(System.console().readLine());
  }
  
  System.out.println();
  
  for(int i=14;i>13;i--) {
    System.out.println(numeroIntroducido[i]);
  }
  
  for(int i=0;i<14;i++) {
    System.out.println(numeroIntroducido[i]);
  }
  
  
  
  
  
  }
}
