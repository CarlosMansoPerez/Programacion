public class Ej2arraysBi{
  public static void main(String[]args){
  
  /*Escribe un programa que pida 20 números enteros.Estos números se deben introducir
  en un array de 4 filas por 5 columnas.El programa mostrará las sumas parciales de filas
  y columnas igual que si de una hoja de cálculo se tratara.La suma total debe aparecer 
  en la esquina inferior derecha.*/
  
  int [][]num=new int[4][5];
  int columnas;
  int filas;
  
  System.out.println("Introduzca los 20 números con los que desea que se haga el programa: ");
  for(filas=0;filas<4;filas++) {
    for(columnas=0;columnas<5;columnas++) {
      System.out.print("Fila "+filas+" Columna "+columnas+": ");
      num[filas][columnas]=Integer.parseInt(System.console().readLine());
    }
  }
  
  int sumaFilas=0;
  
  for(filas=0;filas<4;filas++) {
    for(columnas=0;columnas<5;columnas++) {
      System.out.printf("%6d  ", num[filas][columnas]);
      sumaFilas=num[filas][columnas]+sumaFilas;
    }
  }
  
  
  System.out.print(sumaFilas);
    
  int sumaColumna=0;
  int sumaTotal=0;
  
  for(columnas=0;columnas<5;columnas++) {
    for(filas=0;filas<4;filas++) {
      sumaColumna=num[filas][columnas]+sumaColumna;
    }
    sumaTotal=sumaColumna+sumaTotal;
    System.out.printf("%7d   ",sumaColumna);
  }
  
  System.out.printf("%7d   ",sumaTotal);
  

  
  }
}
