public class Ej19{
  public static void main(String[]args){

/*Escribe un programa que muestre 50 números enteros aleatorios comprendidos entre el -100 y el 200 ambos incluidos y separados
por espacios. Muestra luego el máximo de los pares el mínimo de los impares y la media de todos losnúmeros generados*/

String tecla;
int numeroAzar=0;
int parMax=0;
double media=0;
int elementos=0;
int suma=0;

System.out.print("Pulse ENTER para iniciar el programa");
System.console().readLine();

for(int i=0;i<50;i++) {
  numeroAzar=(int) (Math.random() *300) -100 ;
  System.out.print(numeroAzar+" "); 
  suma=numeroAzar+suma;
  elementos++; 
  if((numeroAzar%2==0) && (numeroAzar>150)) {
    parMax=numeroAzar;
  }
}
media = suma/elementos;

System.out.println();
System.out.println("El número par más alto generado ha sido "+parMax);
System.out.println("La media de todos los números generados es de "+media);

}
}
