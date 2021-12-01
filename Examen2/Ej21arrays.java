public class Ej21arrays{
  public static void main(String[]args){


/*Escribe un programa que rellene un array de 15 elementos con números enteros comprendidos
entre 0 y 500 (ambos incluidos). A continuación, se mostrará el array “cincuerizado”, 
según el siguiente criterio: si el número que hay en una posición del array es múltiplo de
5, se deja igual, y si no, se cambia por el siguiente múltiplo de 5 que exista a partir de
él.*/


int num [] = new int [15];

System.out.print("Pulse ENTER para iniciar el programa: ");
System.console().readLine();
System.out.println();

for(int i=0; i<15; i++) {
  num [i] = (int)(Math.random()*500);
  System.out.print(num[i]+" ");
}

System.out.println();
System.out.println("\n-----------------------RESULTADO----------------------------");
System.out.println();

for(int i=0;i<15;i++){
  while(num[i]%5!=0){
    num[i]++;
  }
}

for(int i=0; i<15; i++) {
  System.out.print(num[i]+" ");
}



}
}
