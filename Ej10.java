public class Ej10{
  public static void main(String[]args){
  
  double suma=0;
  double resultado=0;
  
  System.out.println("¿Con cuántos números vas a hacer la media?: ");
  double numerosintroducidos=Double.parseDouble(System.console().readLine());

  for(int i=0; i<numerosintroducidos; i++){
    System.out.println("Introduce número para hacer la media: ");
    double numeros=Double.parseDouble(System.console().readLine());
    suma=numeros+suma;
  }
  
  resultado=suma/numerosintroducidos;
  System.out.println("La media de los números es: "+(resultado));
  }
}
