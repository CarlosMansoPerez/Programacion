public class EjWhile{
  public static void main(String[]args){

  System.out.println("Introduzca los números");
  System.out.println("SIdesea terminar, introduzca un número negativo");
  
  int numeroIntroducido;
  int cuentaNumeros;
  
  while (numeroIntroducido >=0) {
    numeroIntroducido = Integer.parseInt(System.console().readLine());
    if (numeroIntroducido >=0) {
      cuentaNumeros++;
      suma += numeroIntroducido;
    }
  }
  System.out.println("Has introducido" + cuentaNumeros + " números positivos");
  System.out.println("La suma total es de: " +suma);


}
}
