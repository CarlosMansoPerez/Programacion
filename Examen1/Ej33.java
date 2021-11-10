public class Ej33{
  public static void main(String[]args){
  
  int altura;
  String caracter;
  
  System.out.print("Introduzca la altura que desea que tenga la U: ");
  altura=Integer.parseInt(System.console().readLine());
  System.out.print("Introduzca el carácter que desea que tenga la U: ");
  caracter=System.console().readLine();

    for(int i=0;i<altura;i++) {
  System.out.print(caracter+" ");
    for(int j=2;j<altura;j++) {
      System.out.print("  ");
    }
    System.out.println(caracter);
  }
  for(int i=0;i<altura;i++) {
    System.out.print(caracter+" ");
  }
  
  
  }
}
