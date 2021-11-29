public class Ej5arraysBi{
  public static void main(String[]args){
  
  /*Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros
  positivos comprendidos entre 0 y 1000 (ambos incluidos).A continuación, el programa
  deberá dar la posición tanto del máximo como del mínimo*/
  
  int [][] num=new int [6][10];
  
  int fila;
  int columna;
  int minimo=Integer.MAX_VALUE;
  int filaMinimo=0;
  int columnaMinimo=0;
  int maximo=Integer.MIN_VALUE;
  int filaMaximo=0;
  int columnaMaximo=0;
  
  for(columna=0;columna<10;columna++) {
    System.out.print("      "+columna);    
  }
  
  System.out.println();
  System.out.println();
  
  for(fila=0;fila<6;fila++) {
    System.out.print(" "+fila+"  ");
    for(columna=0;columna<10;columna++) {
      num[fila][columna]=(int)(Math.random()*1001);
      System.out.printf("%5d  ", num[fila][columna]);
      
      if(num[fila][columna]<minimo) {
          minimo=num[fila][columna];
          filaMinimo=fila;
          columnaMinimo=columna;
      }
      
      if(num[fila][columna]>maximo) {
          maximo=num[fila][columna];
          filaMaximo=fila;
          columnaMaximo=columna;
      }

    }
    System.out.println();
  }
  
  System.out.println();
  
  System.out.println("\nEl número máximo es "+maximo+", y está en la Fila "+filaMaximo+", Columna "+columnaMaximo);
  System.out.println("El número mínimo es "+minimo+", y está en la Fila "+filaMinimo+", Columna "+columnaMinimo);
  
  
  
  }
}
