public class Ej31{
  public static void main(String[]args){
  
  int AlturaL;
  String caracter;
  
  System.out.print("Introduzca la altura que desea que tenga la L: ");
  AlturaL=Integer.parseInt(System.console().readLine());
  System.out.print("Introduzca el carácter que desea que tenga la L: ");
  caracter=(System.console().readLine());

  for(int i=1;i<AlturaL;i++) {
    System.out.println(caracter);
  }
  for(int i=0;i<AlturaL/2+1;i++) {
    System.out.print(caracter+" ");
  }
  
  
  
  }
}
