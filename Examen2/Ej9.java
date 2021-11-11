public class Ej9{
  public static void main(String[]args){
  
  /* Realiza un programa que vaya generando números aleatorios pares entre 0 y 100
  y que no termine de generar números hasta que no saque el 24. El programa deberá
  decir al final cuántos números se han generado */
  
  String tecla;
  int numeroAzar=0;
  int elementos =0;
  
  System.out.print("Pulse ENTER para iniciar el programa: ");
  tecla=System.console().readLine();
  
  do {
    numeroAzar=(int) (Math.random() *101) ;
    if(numeroAzar%2==0) {
      System.out.print(numeroAzar+" ");
      elementos++;
    }
    
  }while(numeroAzar!=24);
  
  System.out.println();
  System.out.print("El programa ha acabado y ha generado "+elementos+" números");

  
  }
}
