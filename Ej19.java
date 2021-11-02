public class Ej19{
  public static void main(String[]args){
  
  /*Realiza un programa que pinte una pirámide por pantalla, la altura se debe 
  pedir por teclado.El carácter con el que se pinta la pirámide también se debe pedir
  por teclado.*/
  
  int alturaIntroducida;
  String caracterIntroducido;
  
  System.out.println("Introduzca la altura que desea que tenga la pirámide: ");
  alturaIntroducida=Integer.parseInt(System.console().readLine());
  System.out.println("Introduzca el carácter con el que desea que se forme la pirámide: ");
  caracterIntroducido=System.console().readLine();
  
  int planta = 1;
  int longitud = 1;
  int espacios = alturaIntroducida-1;
  
  while (planta<=alturaIntroducida){
    for(int i=1; i<=espacios; i++){
      System.out.print(" ");
    }
    for(int i=1;i<=longitud;i++){
      System.out.print(caracterIntroducido);
    }
    System.out.println();
    planta++;
    espacios--;
    longitud+=2;
    }
    
  
  
  }
}
