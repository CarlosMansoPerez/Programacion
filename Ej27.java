public class Ej27{
  public static void main(String[]args){
  
  /*Escribe un programa que muestre, cuente y sume los  múltiplos de 3 que hay
  entre 1 y un número leído por teclado*/
  
  int NumeroIntroducido;
  
  System.out.println("El programa mostrará y sumará los múltiplos de 3 entre 1 y el número introducido");
  System.out.print("Introduzca el número hasta el que desea que llegue el programa: ");
  NumeroIntroducido=Integer.parseInt(System.console().readLine());
  
  int cuenta = 0;
  int suma= 0;
  
  for(int i=1; i<NumeroIntroducido; i++) {
    if((i%3)==0) {
      System.out.print(i + " ");
      cuenta++;
      suma = i + suma;
    }
    
  }

  System.out.println("\nDesde 1 hasta "+NumeroIntroducido+" hay "+cuenta+" números");
  System.out.println("Y todos estos múltiplos de 3 suman "+suma);
  }
}
