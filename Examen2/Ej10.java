public class Ej10{
  public static void main(String[]args){

/*Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno
de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud 
aleatoria entre 1 y 40 caracteres.*/

String tecla;
int numeroAzar=0;
  
  System.out.print("Voy pintar 10 líneas de caracteres aleatorios");
  System.out.println();
  System.out.print("Para iniciar el programa inserte cualquier tecla: ");
  tecla=System.console().readLine();
  
  for(int i=0;i<800;i++) {
    numeroAzar=(int) (Math.random() *10) +1;
    if(numeroAzar==1) {
      System.out.print("*");
    }else if(numeroAzar==2) {
      System.out.print("-");
    }else if(numeroAzar==3) {
      System.out.print("=");
    }else if(numeroAzar==4) {
     System.out.print(".");
    }else if(numeroAzar==5) {
     System.out.print("|");
    }else if(numeroAzar==6) {
     System.out.print("@");
    }else if(numeroAzar==7) {
     System.out.print(".");
    }else if(numeroAzar==8) {
     System.out.print("-");
    }else if(numeroAzar==9) {
     System.out.print("=");
    }else if(numeroAzar==10) {
     System.out.print("|");
    }else{
      System.out.println(numeroAzar+" ");
    }
 
  }
  
  

}
}
