public class Ej4{
  public static void main(String[]args){
  
  /*Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) 
  separados por espacios.*/
  
  String tecla;
  int numeroAzar=0;
  
  System.out.print("Voy a decirte 20 números aleatorios entre 0 y 10");
  System.out.println();
  System.out.print("Para iniciar el programa inserte cualquier tecla: ");
  tecla=System.console().readLine();
  
  System.out.print("Los números generados son --> ");
  
  for(int i=0;i<20;i++) {
    numeroAzar=(int) (Math.random() *21) ;
    System.out.print(numeroAzar+" ");
  }
  
  
  }
}
