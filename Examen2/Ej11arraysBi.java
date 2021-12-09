public class Ej11arraysBi {
  public static void main(String[] args) {


/*Realiza un programa que muestre por pantalla un array de 10 filas por 10 columnas relleno
con números aleatorios entre 200 y 300. A continuación, el programa debe mostrar los 
números de la diagonal que va desde la esquinasuperior izquierda a la esquina inferior 
derecha, así como el máximo, el mínimo y la media de los números que hay en esa diagonal.*/

int [][] num = new int [10][10];

System.out.print("Pulse ENTER para ejecutar el programa: ");
System.console().readLine();

System.out.println();

for (int i=0; i<10; i++) {
  for(int j=0;j<10;j++) {
    num[i][j]=(int)(Math.random()*101)+200;
    System.out.printf("%5d",num[i][j]);
  }
  System.out.println();
}

System.out.print("\nPulse ENTER para mostrar la diagonal: ");
System.console().readLine();

System.out.println();

int max=200;
int min=300;
int suma=0;

for(int i=0;i<10;i++) {
  int numero=num[i][i];
  System.out.print(numero+" ");
  if(numero>max) {
    max=numero;
  }
  if(numero<min) {
    min=numero;
  }
  suma=numero+suma;
}

System.out.println();
System.out.println("\nEl número máximo es "+max);
System.out.println("El número mínimo es "+min);
System.out.println("La media de estos es de "+((double)suma/10));


}
}
