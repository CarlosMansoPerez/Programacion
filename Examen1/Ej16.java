public class Ej16{
  public static void main(String[]args){
  
  System.out.println("Introduzca un número entero para saber si es primo o no: ");
  int numeroIntroducido=Integer.parseInt(System.console().readLine());
  
  boolean Primo = true;
  
for(int i=2;i<numeroIntroducido;i++){
  if((numeroIntroducido%i)==0)
    {Primo=false;}
      }if(Primo){
        System.out.println("El número introducido  SI es primo.");
      }else{
        System.out.println("El número introducido NO es primo.");}
  
  }
}
