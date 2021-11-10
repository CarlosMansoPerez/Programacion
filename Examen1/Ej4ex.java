public class Ej4ex{
  public static void main(String[]args){
  
  int Pin;
  String resultado = " ";
  
  System.out.print("Introduzca el PIN: ");
  Pin = Integer.parseInt(System.console().readLine());
  
  if(Pin == 0) {
    resultado = "cero";
  }else{
    while (Pin>0) {
      int ultimaCifra = Pin % 10;
      Pin = Pin/10;
      String ultimacifraLetra;
      switch (ultimaCifra) {
        case 0:
        ultimaCifra = "cero";
        break;
        case 1:
        ultimacifra = "uno";
        break;
        case 2:
         ultimaCifra = "dos";
        break;
        case 3:
        ultimaCifra= "tres";
        break;
        case 4:
        ultimaCifra = "cuatro";
        break;
        case 5:
         ultimaCifra = "cinco";
        break;
        case 6:
        ultimaCifra= "seis";
        break;
        case 7:
         ultimaCifra= "siete";
        break;
        case 8:
         ultimaCifra = "ocho";
        break;
        case 9:
         ultimaCifra = "nueve";
        break;
        default:
      }
      resultado += ultimaCifra;
    }
  }
  System.out.println(resultado);
  }
}
