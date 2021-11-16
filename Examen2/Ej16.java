public class Ej16{
  public static void main(String[]args){
  
  /* Realiza un simulador de máquina tragaperras */
  
  String tecla;
  int figura;
  int figura1=0;
  int figura2=0;
  int figura3=0;
  
  System.out.print("Pulse ENTER para iniciar el juego");
  System.console().readLine();
  System.out.println("       TRAGAPERRAS");
  System.out.println();
  
  for(int i=0;i<3;i++) {
    figura=(int)(Math.random() *5);
    switch(figura) {
      case 0:
      System.out.print("corazón ");
      break;
      case 1:
      System.out.print("diamante ");
      break;
      case 2:
      System.out.print("herradura ");
      break;
      case 3:
      System.out.print("campana ");
      break;
      case 4:
      System.out.print("limón ");
      break;
      default:
    }
    switch (i) {
    case 0:
    figura1=figura;
    break;
    case 1:
    figura2=figura;
    break;
    case 2:
    figura3=figura;
    break;
    default:
    }
  }
  
  if ((figura1!=figura2) && (figura1!=figura3) && (figura2!=figura3)) {
  System.out.print("\nLo siento, has perdido");
  }else if((figura1==figura2) && (figura2==figura3)) {
  System.out.print("\nEnhorabuena! Has ganado");
  }else {
  System.out.print("\nHas recuperado la moneda");
  }
}
}
