public class Piramide{
  public static void main(String[]args){
  
  System.out.print("Introduce la altura de la pirámide: ");
  int alturaPiramide=Integer.parseInt(System.console().readLine());
  System.out.print("Introduce el carácter que quieres que forme la pirámide: ");
  String relleno=System.console().readLine();
  int planta=1;
  int longitud=1;
  int espacios=alturaPiramide-1;
  while(planta<=alturaPiramide){
  for(int i=1;i<=espacios;i++){
  System.out.print(" ");
  }
  for(int i=1;i<=longitud;i++){
    System.out.print(relleno);
    }
    System.out.println();
    planta++;
    espacios--;
    longitud+=2;
    }
  }
}
  
  
 
