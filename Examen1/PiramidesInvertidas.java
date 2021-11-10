public class EjPiramidesInvertidas{
  public static void main(String[]args){
  
  int altura1, altura2;
  int hmax;
  
  System.out.println("Introduzca la altura de la primera pirámide");
  altura1=Integer.parseInt(System.console().readLine());
  System.out.println("Introduzca la altura de la segunda pirámide");
  altura2=Integer.parseInt(System.console().readLine());
  
  if (altura1>altura2) {
    hmax = altura1;
  }else{
    hmax = altura2;
  }
  
  int espaciosPir1 = 0;
  int espaciosPir2 = 0;
  int rellenoPir1 = altura1;
  int rellenoPir2 = altura2;
  
  for (int i=0; i<hmax; i++) {
    for (int j=0; j<espaciosPir1; j++) {
      System.out.print("");
    }
    for (int j=0; j<espaciosPir1-1; j++) {
      System.out.print(" ");
    }
    for (int j=0; j<espaciosPir2; j++) {
      System.out.print("");
    }
    for (int j=0; j<espaciosPir2-1; j++) {
      System.out.print(" ");
    }  
    for (int j=0; j<rellenoPir1; j++) {
      System.out.print("o");
    }
    for (int j=0; j<rellenoPir2; j++) {
      System.out.print("o");
    }
  
  }
  
  
  
  }
}
