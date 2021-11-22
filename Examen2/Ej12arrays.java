public class Ej12arrays{
  public static void main(String[]args){
  
  int [] numeroIntroducido=new int [10];
  int [] resultado=new int [10];
  int i;
  int posicionInicial=0;
  int posicionFinal=0;
  int numeroInicial=0;
  int numeroFinal=0;
  
  System.out.println("Introduzca los 10 números:");
  
  for(i=0;i<10;i++) {
    numeroIntroducido[i]=Integer.parseInt(System.console().readLine());
  }
  
  System.out.print("\nÍndice");
  for(i=0;i<10;i++) {
    System.out.printf("|%-5d",i);
  }
  System.out.print("\nValor ");
  for(i=0;i<10;i++) {
    System.out.printf("|%-5d",numeroIntroducido[i]);
  }
  
  do {
  System.out.print("\nIntroduzca la posición inicial: ");
  posicionInicial=Integer.parseInt(System.console().readLine());
  System.out.print("Introduzca la posición final: ");
  posicionFinal=Integer.parseInt(System.console().readLine());
  }while(posicionInicial < 0 || posicionFinal < 0 || posicionInicial > 9 || posicionFinal > 9 || posicionFinal < posicionInicial);  
  numeroInicial=numeroIntroducido[posicionInicial];
  numeroFinal=numeroIntroducido[9];
  
  for (i = 9; i > 0; i--) {
    if (i == posicionFinal) numeroIntroducido[i] = numeroInicial; 
    else if (!(i > posicionInicial && i < posicionFinal)) numeroIntroducido[i] = numeroIntroducido[i - 1];
      
    }
  
  numeroIntroducido[0] = numeroFinal;
  
  System.out.print("\nIndice: ");
    for (i = 0; i < 10; i++) System.out.printf("|%-5d", i);

    System.out.println();

    System.out.print("Valor:  ");
    for (i = 0; i < 10; i++) System.out.printf("|%-5d", numeroIntroducido[i]);
  
  }
}
