public class Ej5{
  public static void main(String[]args){
  
  /*Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)separados
  por espacios. Muestra también el máximo, el mínimo y la media de esos números.*/
  
  String tecla;
  int numeroAzar;
  int suma=0;
  int media=0;
  int maximo=195;
  int minimo=105;
  
  System.out.print("Voy a decirte 50 números aleatorios entre 100 y 199");
  System.out.println();
  System.out.print("Para iniciar el programa inserte cualquier tecla: ");
  tecla=System.console().readLine();
  
  System.out.println();
  System.out.println("Los números generados son los siguientes:  ");
  
  for(int i=0;i<50;i++) {
    numeroAzar=(int) (Math.random() *100) +100;
    System.out.print(numeroAzar+" ");
    suma+=numeroAzar;
    media=suma/50;
    
    if(numeroAzar>=maximo) {
      maximo=numeroAzar;
    }
   if(numeroAzar<=minimo) {
      minimo=numeroAzar;
    }
  }
  System.out.println();
  System.out.println();
  System.out.println("La media de todos los números es "+media);
  System.out.println("El número más pequeño es "+minimo);
  System.out.print("El número más grande es "+maximo);

  }
}
