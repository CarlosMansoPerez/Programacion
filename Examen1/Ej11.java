public class Ej11{
  public static void main(String[]args){
  
  System.out.println("Van a aparecer el número introducido y los 4 siguientes");
  System.out.print("¿Con qué número quieres hacer el cuadrado y el cubo?: ");
  int numero=Integer.parseInt(System.console().readLine());
  
  for(int i=numero; i<numero+5; i++){
    System.out.println(""+i+"   "+(i*i)+"   "+(i*i*i)+"   ");
  }
}
}
