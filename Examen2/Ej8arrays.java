public class Ej8arrays{
  public static void main(String[]args){
  
  /*Realiza un programa que pida la temperatura media que ha hecho en cada mes de un 
  determinado año y que muestre a continuación un diagrama de barras horizontales con
  esos datos. Las barras del diagrama se pueden dibujar a base de asteriscos o cualquier
  otro carácter.*/
  
  int [] temperatura=new int [12];
  String [] mes = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", 
  "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
  int i;
  int j;
  
  System.out.println("Introduzca las temperaturas media que ha hecho en cada mes ");

  System.out.println();
  
  for(i=0;i<12;i++) {
    System.out.print("Temperatura media de "+mes[i]+": ");
    temperatura[i]=Integer.parseInt(System.console().readLine());
  }
  
  System.out.println();
  
  for(i=0;i<12;i++) {
    System.out.printf(" %-10s ",mes[i]);
    
    for(j=0;j<temperatura[i];j++) {
      System.out.print("▥");
    }
    
    System.out.println();
  }
  
  
  }
}
