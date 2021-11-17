public class Ej3arrays{
  public static void main(String[]args){
  
  /* Escribe un programa que lea 10 números por teclado y que luego los muestre 
  en orden inverso,es decir,el primero que se introduce es el último en mostrarse 
  y viceversa*/
  
  int numeroIntroducido=0;
  int[]num;
  int i=0;
  num=new int[10];


  System.out.println("Introduzca los 10 números: ");
  
  for(i=0;i<10;i++) {
  num[i]=Integer.parseInt(System.console().readLine());
  }
  System.out.println("Le damos la vuelta");
  for(i=9;i>=0;i--) {
  System.out.println(num[i]);
  }


  
  
  
  
  }
}
