public class Ej6arraysBi{
  public static void main(String[]args){
  
  int [][] num=new int [6][10];
  
  int fila;
  int columna;
  
  int minimo=Integer.MAX_VALUE;
  int filaMinimo=0;
  int columnaMinimo=0;
  
  int maximo=Integer.MIN_VALUE;
  int filaMaximo=0;
  int columnaMaximo=0;
  
  boolean repetido;
  int i;
  int j;
  
  for(fila=0;fila<6;fila++) {
    for(columna=0;columna<10;columna++){
      do{
        num[fila][columna]=(int)(Math.random()*1001);
        
        repetido=false;
        for(i=0;i<10*fila+columna;i++){
          if(num[fila][columna]==num[i/10][i%10]){
            repetido=true;
          }
        }
      }while(repetido);
      
    }
  }
  
  
  
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
