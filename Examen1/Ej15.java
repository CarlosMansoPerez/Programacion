public class Ej15{
  public static void main(String[]args){
  
  int base;
  int exponente;
  double resultado = 1;
    
  System.out.println("Introduzca la base inicial: ");
  base = Integer.parseInt(System.console().readLine());
  System.out.println("Introduzca el exponente inicial: ");
  exponente = Integer.parseInt(System.console().readLine());

  for (int i=1; i<=exponente; i++) {
  
    for (int j=1; j<i; j++) {
    resultado = resultado * base;
  }
  
  System.out.println(base+"^"+exponente+"="+resultado);
  base = base + 1;
}
  }
}

