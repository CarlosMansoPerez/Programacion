public class Ej13{
  public static void main(String[]args){
  
  /*Escribe un programa que simule la tirada de dos dados. El programa deberá continuar
  tirando los dados una y otra vez hasta que en alguna tirada los dos dados tengan el mismo valor.*/
  
  String tecla;
  int numeroAzar1=1;
  int numeroAzar2=1;
  int tiradas =1;
  
  System.out.println("El programa acabará cuando los 2 dados salgan con el mismo valor");
  System.out.print("Pulse ENTER para iniciar el programa: ");
  tecla=System.console().readLine();
  
  do {
    System.out.println("Tirada "+tiradas+"º");
    for(int i=1;i<2;i++) {
    numeroAzar1=(int) (Math.random() *6) ;
    System.out.print(" "+numeroAzar1+" ");
    } 
    for(int i=1;i<2;i++) {
    numeroAzar2=(int) (Math.random() *6) ;
    System.out.print(" "+numeroAzar2+" ");
    }
    System.out.println();
    tiradas++;
  }while(numeroAzar1!=numeroAzar2);
  
  
  }
}
