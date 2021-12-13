public class Ej13arraysBi {
  public static void main(String[] args) 
  throws InterruptedException{
  
  /*Realiza un programa que calcule la estatura media, mínima y máxima en centímetros
  de personas de diferentes países. El array que contiene los nombres de los paises es 
  el siguiente:pais = {“España”, “Rusia”, “Japón”,“Australia”}. Los datos sobre las 
  estaturas se deben simular mediante un array de 4 filas por 10 columnas con números 
  aleatorios generados al azar entre 140 y 210. Los decimales de la media se pueden
  despreciar. Los nombres de los países se deben mostrar utilizando el array de países 
  (no se pueden escribir directamente)*/
  
  int [][] num = new int [4][10];
  int suma=0;
  int max=Integer.MIN_VALUE;
  int min=Integer.MAX_VALUE;
  String [] pais={"España","Rusia","Japón","Australia"};

  
  System.out.print("Pulse ENTER para generar las estaturas de las personas: ");
  System.console().readLine();
  Thread.sleep(800);
  System.out.println();
  System.out.print("El programa ya ha generado las estaturas de todas las personas, vuelva a");
  System.out.print(" pulsar ENTER para ver el resultado: ");
  System.out.println();
  System.console().readLine();
  
  for(int veces=0;veces<4;veces++){
  System.out.println(pais[veces]);
  System.out.println(); 
  for(int i=0;i<4;i++){
    for(int j=0;j<10;j++) {
      num[i][j]= (int)(Math.random()*61)+140;
      System.out.printf("%5d",num[i][j]);
      suma+=num[i][j];
      if(num[i][j]<min){
        min=num[i][j];
      }
      if(num[i][j]>max){
        max=num[i][j];
      }
    }
    System.out.println();
  }

  
  System.out.println();
  
  System.out.println("\nEstatura máxima: "+max+" cm");
  System.out.println("Estatura mínima: "+min+" cm");
  System.out.println("La media de las estaturas es de: "+suma/40+" cm");
  
}
  
  
  
  
  }
}
