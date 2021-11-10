public class Ej19{
  public static void main(String[]args){
  
  /*El programa pinta una "pirámide rellena porosa" hacia arriba, con la altura y el carácter indicado por el usuario*/
  
  int alturaIntroducida;
  String caracterIntroducido;
  
  System.out.print("Introduzca la altura que desea que tenga la pirámide: ");
  alturaIntroducida=Integer.parseInt(System.console().readLine());
  System.out.print("Introduzca el carácter con el que desea que se forme la pirámide: ");
  caracterIntroducido=System.console().readLine();
  System.out.print("\n");

  int planta = 1;
  int longitud = 1;
  int espacios = alturaIntroducida;
  
  while (planta<=alturaIntroducida){
    for(int i=1; i<=espacios-1; i++){
      System.out.print(" ");
    }
    for(int i=1;i<=longitud;i++){
      System.out.print(caracterIntroducido+" ");
    }
    System.out.println();
    planta++;
    espacios--;
    longitud+=1;
    }
    
  
  
  }
}
