public class Ej18{
  public static void main(String[]args){
  
  /*Escribe un programa que obtenga los números enteros comprendidos entre dos números
  introducidos por teclado y validados como distintos, el programa debe empezar por
  el menor de los enteros introducidos e ir incrementando de 7 en 7.*/
  
  int numero1;
  int numero2;
  int mayor;
  int menor;
  
  do{
    System.out.println("Introduzca uno de los números con el que desea realizar el programa");
    numero1=Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca el otro número con el que desea realizar el programa");
    numero2=Integer.parseInt(System.console().readLine());

    if(numero1 == numero2){
      System.out.println("Error, los números introducidos deben ser diferentes");
    }
  }while(numero1 == numero2);

  if(numero1 > numero2){
    mayor = numero1;
    menor = numero2;
  }else{
    mayor = numero2;
    menor = numero1;
  }
  
  System.out.println("Los números son los siguientes: ");

  for(int i=menor;i<=mayor;i+=7){
    System.out.print(i+" ");
  }
  
}
}
