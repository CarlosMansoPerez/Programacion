public class Ej11{
  public static void main(String[]args){
  
  /* Escribe un programa que muestre 20 notas generadas al azar. Las notas deben 
  aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. 
  Al final aparecerá el número de suspensos, el número de suficientes, el número 
  de bienes, etc */
  
  String tecla;
  int notaAzar=0;
  int suspensos=0;
  int suficientes=0;
  int bienes=0;
  int notables=0;
  int sobresalientes=0;
  int suma=0;
  int media=0;
  
  
  System.out.print("Voy a decirte 20 notas aleatorias entre 0 y 10");
  System.out.println();
  System.out.print("Para iniciar el programa pulse ENTER: ");
  tecla=System.console().readLine();
  
  System.out.println("Las notas generadas son las siguientes: ");
  
  for(int i=0;i<20;i++) {
    notaAzar=(int) (Math.random() *21) ;
    if(notaAzar==11){
    System.out.println("1 INSUFICIENTE");
    suspensos++;
    }else if(notaAzar==12){
    System.out.println("2 INSUFICIENTE");
    suspensos++;
    }else if(notaAzar==13){
    System.out.println("3 INSUFICIENTE");
    suspensos++;
    }else if(notaAzar==14){
    System.out.println("4 INSUFICIENTE");
    suspensos++;
    }else if(notaAzar==15){
    System.out.println("5 SUFICIENTE");
    suficientes++;
    }else if(notaAzar==16){
    System.out.println("6 BIEN");
    bienes++;
    suma++;
    }else if(notaAzar==17){
    System.out.println("7 NOTABLE");
    notables++;
    }else if(notaAzar==18){
    System.out.println("8 NOTABLE");
    notables++;
    }else if(notaAzar==19){
    System.out.println("9 SOBRESALIENTE");
    sobresalientes++;
    }else if(notaAzar==12){
    System.out.println("10 SOBRESALIENTE (Matrícula de honor)");
    sobresalientes++;
    }
  }
  System.out.println();
  System.out.println("Ha habido "+suspensos+" suspenso/s");
  System.out.println("Ha habido "+suficientes+" suficiente/s");
  System.out.println("Ha habido "+bienes+" bien/es");
  System.out.println("Ha habido "+notables+" notable/s");
  System.out.println("Ha habido "+sobresalientes+" sobresaliente/s");
}
}
