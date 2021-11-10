public class EjWhile{
  public static void main(String[]args){
  
  System.out.println("Vamos a realizar la suma de los números que desee."); 
  System.out.println("Introduzca los números, y si desea terminar, introduzca un número negativo");
   
  int numeroIntroducido = 0;
  int cuentaNumeros = 0;
  int suma = 0;
  
  while (numeroIntroducido >=0) {
    numeroIntroducido = Integer.parseInt(System.console().readLine());
    if (numeroIntroducido >=0) {
      cuentaNumeros++;
      suma += numeroIntroducido;
    }
  }
  System.out.println("Has introducido " + cuentaNumeros + " números positivos");
  System.out.println("La suma total es: " +suma);


}
}
