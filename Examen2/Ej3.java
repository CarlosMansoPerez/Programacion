public class Ej3{
  public static void main(String[]args){
  
  /*Igual que el ejercicio anterior pero con la baraja española. Se utilizará la
  baraja de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as*/
  
    String tecla;
  int cartaAzar;
  int numero=0;
  int simboloAzar;
  int simbolo=0 ;
  
  System.out.print("Voy a decirte una carta al azar de la baraja española");
  System.out.println();
  System.out.print("Para iniciar el programa inserte cualquier tecla: ");
  tecla=System.console().readLine();
  
  for(int i=0;i<1;i++) {
    cartaAzar=(int) (Math.random() *10) +1;
    if(cartaAzar==1) {
      System.out.print("as");
    }else if(cartaAzar==8) {
      System.out.print("sota");
    }else if(cartaAzar==9) {
      System.out.print("caballo");
    }else if(cartaAzar==10) {
     System.out.print("rey");
    }else{
      System.out.print(cartaAzar+" ");
    }
 
  }
  
  for(int i=0;i<1;i++) {
    cartaAzar=(int) (Math.random() *4) +1;
    if(cartaAzar==1) {
      System.out.print("de bastos");
    }
    if(cartaAzar==2) {
      System.out.print("de copas");
    }
    if(cartaAzar==3) {
      System.out.print("de espadas");
    }
    if(cartaAzar==4) {
     System.out.print("de oros");
    }
  
  }
  
  
  }
}
