public class Ej2arrays{
  public static void main(String[]args){

/* Define un array de 10 caracteres con nombre simbolo y asigna valores a los 
elementos según la tabla que se muestra a continuación. Muestra el contenido de 
todos los elementos del array. */

String[]num;
num=new String[10];

num[0]="a";
num[1]="x";
num[2]=" ";
num[3]=" ";
num[4]="@";
num[5]=" ";
num[6]="' '";
num[7]="+";
num[8]=" ";
num[9]="Q";

for(int i=0;i<10;i++) {
  System.out.println("num["+i+"]--> "+num[i]);
}


}
}
