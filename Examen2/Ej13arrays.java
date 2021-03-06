public class Ej13arrays{
  public static void main(String[]args){
  
  /*Escribe un programa que rellene un array de 100 elementos con números enteros 
  aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación el programa 
  mostrará el array y preguntará si el usuario quiere destacar el máximo o el mínimo.
  Seguidamente se volverá a mostrar el array escribiendo el número destacado entre dobles
  asteriscos.*/
  
  int num [] =  new int [100];
  int decision;
  int max=Integer.MIN_VALUE;
  int min=Integer.MAX_VALUE;
  
  System.out.println("Pulse ENTER para iniciar el programa:");
  System.console().readLine();
  
  for(int i=0;i<100;i++) {
    num[i]= (int)(Math.random()*501);
    System.out.print(" "+num[i]);
    
    if(num[i]>max){
      max=num[i];
    }
    if(num[i]<min){
      min=num[i];
    }
    
  } 
  
  System.out.println();
  System.out.println();
  
  System.out.print("¿Quieres destacar el MÍNIMO=1 o el MÁXIMO=2?: ");
  decision=Integer.parseInt(System.console().readLine());
  
  System.out.println();
  
  for(int i=0;i<100;i++) {
    if(decision==2 && num[i]==max){
      System.out.print(num[i]+" "+"**"+max+"**"+" ");
    }else if(decision==1 && num[i]==min){
      System.out.print(num[i]+" "+"**"+min+"**"+" ");
    }else{
      System.out.print(num[i]+" ");
    }
  } 
    
  
  }
}
