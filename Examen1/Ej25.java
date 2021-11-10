public class Ej25{
  public static void main(String[]args){
  
  /*25.Realiza un programa que pida un número por teclado y que luego muestre ese
  número al revés.*/
  
  int NumeroIntroducido; 
  int AlReves = 0;
  int numero;
  
  System.out.println("Introduzca un número y el programa te dará ese mismo número al revés: ");
  NumeroIntroducido=Integer.parseInt(System.console().readLine());
  numero = NumeroIntroducido;
  
  while (NumeroIntroducido > 0) {
    AlReves = (AlReves* 10) + (NumeroIntroducido%10);
    NumeroIntroducido = NumeroIntroducido/10;
  }
  
  System.out.println("Si le damos la vuelta al "+numero+" tenemos el "+AlReves);
  
  }
}
