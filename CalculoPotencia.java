public class CalculoPotencia{
  public static void main(String[]args){
  
  int resultado = 1;
  int base;
  int exponente;
  System.out.print("Introduzca la base: ");
  base = Integer.parseInt(System.console().readLine());
  System.out.print("Introduzca el exponente: ");
  exponente = Integer.parseInt(System.console().readLine());

 for(int i=0; i<exponente; i++){
   resultado = resultado*base;
 }
 
 System.out.println(base + " ^ " + exponente+" = "+resultado);
  
  
  
  }
}
  
