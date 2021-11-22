public class Ej7arrays{
  public static void main(String[]args){

int[] numeroIntroducido=new int[100];
int i;
String verde="\033[32m";
String blanco="\033[37m";

for(i=0;i<100;i++){
  numeroIntroducido[i]=(int)(Math.random()*21);
  System.out.print(numeroIntroducido[i]+"  ");
  }
  System.out.print("\nIntroduzca uno de los números que se han mostrado: ");
  int valor1=Integer.parseInt(System.console().readLine());
  System.out.print("Introduzca el número por el que lo quiere sustituir: ");
  int valor2=Integer.parseInt(System.console().readLine());
  System.out.println();
  
  for(i=0;i<100;i++){
    if(numeroIntroducido[i]==valor1){
      numeroIntroducido[i]=valor2;
        System.out.print("\033[32m"+" '"+numeroIntroducido[i]+"'   ");
      }else{
        System.out.print("\033[37m"+numeroIntroducido[i]+"  ");
      }
  }
}
}
