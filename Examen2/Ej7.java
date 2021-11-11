public class Ej7{
  public static void main(String[]args){
  
  /*Escribe un programa que muestre tres apuestas de la quiniela en tres columnas 
  para los 14 partidos y el pleno al quince (15 filas).*/

  int numeroAzar=1;
  String equis;
  
  System.out.println("      QUINIELA");
  
  for(int i=1;i<15;i++) {
    System.out.println("|------------------|");
    
    for(int j=1;j<3;j++){
      numeroAzar=(int) (Math.random() *3) +1;
      if(numeroAzar==3) {
        equis="x";
        System.out.print("   "+equis+"   ");
      }else{
        System.out.print("   "+numeroAzar+"   ");
      }
    }
    System.out.println("  "+numeroAzar);
  }
  System.out.println("|------------------|");
  }
}
