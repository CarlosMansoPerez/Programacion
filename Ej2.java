public class Ej2{
  public static void main(String[]args){
  
  /*Realiza un programa que muestre al azar el nombre de una carta de la baraja 
  francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
  y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son 
  numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el 1).*/
  
  String tecla;
  int cartaAzar;
  int numero=0;
  int simboloAzar;
  int simbolo=0 ;
  
  System.out.print("Voy a decirte una carta al azar de la barajan francesa");
  System.out.println();
  System.out.print("Para iniciar el programa inserte cualquier tecla: ");
  tecla=System.console().readLine();
  
  for(int i=0;i<1;i++) {
    cartaAzar=(int) (Math.random() *13) +1;
    if(cartaAzar==1) {
      System.out.print("A");
    }else if(cartaAzar==11) {
      System.out.print("J");
    }else if(cartaAzar==12) {
      System.out.print("Q");
    }else if(cartaAzar==13) {
     System.out.print("K");
    }else{
      System.out.print(cartaAzar+" ");
    }
 
  }
  
  for(int i=0;i<1;i++) {
    cartaAzar=(int) (Math.random() *4) +1;
    if(cartaAzar==1) {
      System.out.print("☘ ");
    }
    if(cartaAzar==2) {
      System.out.print("✡");
    }
    if(cartaAzar==3) {
      System.out.print("♡");
    }
    if(cartaAzar==4) {
     System.out.print("✦ ");
    }
  
  }

  }
}
