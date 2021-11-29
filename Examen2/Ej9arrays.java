public class Ej9arrays{
  public static void main(String[]args){


/*Realiza un programa que pida 8 números enteros y que luego muestre esos números 
junto con la palabra "par" o "impar" según proceda.*/

int [] num=new int [8];

System.out.println("Introduzca los 8 números para hacer el programa: ");

for(int i=0;i<8;i++) {
  num[i]=Integer.parseInt(System.console().readLine());
}

System.out.println();
System.out.println("RESULTADO");
System.out.println();

for(int i=0;i<8;i++) {
  System.out.print(num[i]);
  if(num[i]%2==0) {
    System.out.println(" PAR");
  }else{
    System.out.println(" IMPAR");
  }
}
  }
}
