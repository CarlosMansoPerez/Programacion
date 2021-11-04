public class Ej29{
  public static void main(String[]args){
  
  /*Escribe un programa que muestre por pantalla  todos  los números enteros positivos
  menores a uno leído por teclado que no sean divisibles entre otro también leído 
  de igual forma*/
  
  int NumeroMax;
  int NumeroDivisor;
  
  System.out.println("Introduzca el número positivo máximo que desea que llegue el programa: ");
  NumeroMax=Integer.parseInt(System.console().readLine());
  System.out.println("Introduzca el número que quiere que no sea divisor de los que aparecerán: ");
  NumeroDivisor=Integer.parseInt(System.console().readLine());

  System.out.println("\nLos números positivos menores a "+NumeroMax+" que no son divisibles entre "+NumeroDivisor+", son estos: ");
  
  for(int i=1; i<NumeroMax; i++) {
    if((i%NumeroDivisor)==1) {
      System.out.print(i + " ");
    }
      
      
    
  }
  
  
  
  }
}
