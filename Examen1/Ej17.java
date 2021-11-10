public class Ej17{
  public static void main(String[]args){
  
  /*Realiza un programa que sume los 100 números siguientes a un número entero y positivo
  introducido por teclado. Se debe comprobar que el dato introducido es correcto 
  (que es un número positivo)*/
  
  int numeroIntroducido = 0;
  int suma = 0;
  
  System.out.println("Introduzca un número positivo al que se le sumarán los 100 números siguientes");
  numeroIntroducido=Integer.parseInt(System.console().readLine());
  if (numeroIntroducido>0){
  for(int i=numeroIntroducido;i<numeroIntroducido+100;i++){
    suma += i;
    }
    System.out.println("La suma de los 100 números siguientes a "+numeroIntroducido+" es "+suma);
  }else{
    System.out.print("Error, debe introducir un número positivo");
    
    

  }
  
  
  }
}
