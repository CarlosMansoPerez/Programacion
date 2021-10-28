public class Ej7{
  public static void main(String[]args){
    
  final int contrasenia = 2222;
  final int intentos = 4;
  boolean acertado = false;
  
  for (int j = 1; j<=intentos && acertado==false; j++){
    System.out.println("Para acceder a la caja fuerte es necesario introducir la contraseña de 4 cifras: ");
    int contraseniaIntroducida = Integer.parseInt(System.console().readLine());
    if(contraseniaIntroducida == contrasenia){
      System.out.println("Contraseña correcta, ya puedes acceder a la caja fuerte");
      acertado = true;
    }else{
      System.out.println("Contraseña incorrecta");
    }
  }
  System.out.print("Fin del programa");
}
}
