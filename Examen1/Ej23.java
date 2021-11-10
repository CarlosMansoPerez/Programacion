public class Ej23{
  public static void main(String[]args){
  
  /*Escribe un programa que permita ir introduciendo una serie indeterminada de 
  números mientras su suma no supere  el valor 10000. Cuando esto último ocurra,
  se debe mostrar el total acumulado, el contador de los números introducidos y la media.*/
  
  int NumerosIntroducidos;
  int suma = 0;
  int NumeroElementos = 0;
  
  System.out.println("Vaya introduciendo números, estos se irán sumando continuamente hasta que su \nsuma rebase 10000: ");
  
  do {
    NumerosIntroducidos=Integer.parseInt(System.console().readLine());
    suma = NumerosIntroducidos + suma;
    NumeroElementos++;
  }while (suma<=10000);
  
  System.out.println("El total de números introducidos es de "+NumeroElementos);
  System.out.println("El total acumulado es de "+suma);
  System.out.println("La media es de "+suma/ (double)NumeroElementos);

  }
}
