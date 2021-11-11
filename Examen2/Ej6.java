public class Ej6{
  public static void main(String[]args){
  
  /*Escribe un programa que piense un número al azar entre 0 y 100. El usuario 
  debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,
  el programa dirá cuántas oportunidades quedan y si el número introducido es 
  menor o mayor que el número secreto*/
  
  int numeroIntroducido;
  int numeroAzar;
  int intentos=5;
  
  System.out.print("Introduzca un número entre el 0 y 100 para tratar de adivinarlo: ");
  numeroIntroducido=Integer.parseInt(System.console().readLine());
  
  
  do {
  for(int i=0;i<1;i++) {
    numeroAzar=(int)(Math.random() *101);
    if(numeroIntroducido==numeroAzar) {
    System.out.print("Enhorabuena, has acertado el número escondido "+numeroAzar);
  }else{
    System.out.println("Lo siento, el número introducido no es correcto, te quedan "+intentos+" intento/s");
    System.out.println("Prueba con otro número: ");
    numeroIntroducido=Integer.parseInt(System.console().readLine());
  }
  if(numeroIntroducido<0) {
    System.out.println("Error, el número introducido debe estar entre 0 y 100");
  }
  if(numeroIntroducido>100) {
    System.out.println("Error, el número introducido debe estar entre 0 y 100");
  }
  intentos--;
  }
  
  }while(intentos>0);
  
  
  
  
  
  
  }
}
