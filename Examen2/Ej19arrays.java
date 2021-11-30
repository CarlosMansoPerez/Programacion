public class Ej19arrays{
  public static void main(String[]args){
  
  /*Realiza un programa que sea capaz de insertar un número en una posición concreta 
  de un array. En primer lugar, el programa generará un array de 12 números enteros 
  aleatorios entre 0 y 200 ambos incluidos. A continuación se debe mostrar el contenido 
  de ese array junto al índice (0 – 11). Seguidamente el programa preguntará por el
  número que se quiere insertar y por la posición donde será insertado. Los números del 
  array se desplazan a la derecha para dejar sitio al nuevo. El último número (el que se
  encuentra en la posición 11)siempre se perderá.*/
  
  
  
  int num [] = new int [12];
  int numeroIntroducido=0;
  int posicionIntroducida=0;
  
  System.out.println("Pulse ENTER para iniciar el programa: ");
  System.console().readLine();
  
  for(int i=0;i<12;i++) {
    System.out.printf(" %4d",i);
  }
  
  System.out.println();
  
  for(int i=0;i<12;i++) {
    num[i]=(int)(Math.random()*200);
    System.out.printf(" %4d",num[i]);
  }
  
  System.out.println();
  
  System.out.print("\n¿Qué número (0-200) quiere insertar?: ");
  numeroIntroducido=Integer.parseInt(System.console().readLine());
  System.out.print("¿En qué posición (0-11) quiere insertarlo?: ");
  posicionIntroducida=Integer.parseInt(System.console().readLine());
  
  for(int i=11;i>posicionIntroducida;i--){
    num[i]=num[i-1];
  }
  num[posicionIntroducida]=numeroIntroducido;
  
  System.out.println();
  System.out.println("----------------------------RESULTADO------------------------------");
  System.out.println();
  
  for(int i=0;i<12;i++) {
    System.out.printf(" %4d",i);
  }
  
  System.out.println();
  
  for(int i=0;i<12;i++) {
    System.out.printf(" %4d",num[i]);
  }
  
  
}
}
