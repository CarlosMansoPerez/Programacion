public class Ej21{
  public static void main(String[]args){
  
  /*Realiza un programa que vaya pidiendo números hasta que se introduzca un numero
  negativo y nos diga cuantos números se han introducido, la media de los impares y
  el mayor de los pares.El número negativo sólo se utiliza para indicar el final de
  la introducción de datos pero no se incluye en el cómputo.*/
  
  int NumeroIntroducido;
  int ParMax = 0;
  int SumaImpares = 0;
  int NumeroElementos = 0;
  int NumeroElementosImpares = 0;
  
  System.out.println("Introduzca números positivos hasta que desee acabar, que debe introducir \nun número negativo");
  
  do{
    NumeroIntroducido=Integer.parseInt(System.console().readLine());
    
    if(NumeroIntroducido>=0) {
      NumeroElementos++;
      if((NumeroIntroducido%2)==1) { /*numero impar*/
        SumaImpares += NumeroIntroducido;
        NumeroElementosImpares++;
      }else { /* numero par*/
        if(NumeroIntroducido > ParMax) 
        ParMax = NumeroIntroducido;
         
      }
      
    }
  
  }while (NumeroIntroducido>=0);
  
  
    System.out.println("Has introducido "+NumeroElementos+" números positivos");
    System.out.println("La media de los impares introducidos es de "+SumaImpares/NumeroElementosImpares);
    System.out.println("El número par más alto que has introducido es "+ParMax);

  }
}
