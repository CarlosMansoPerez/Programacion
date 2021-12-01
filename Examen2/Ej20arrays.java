public class Ej20arrays{
  public static void main(String[]args){


/*Implementa un programa que calcule la denominación ordinal de los reyes de una 
secuencia histórica. El programa solicitará la cantidad de reyes que sevan a introducir, 
y a continuación recibirá los nombres de los reyes. Presentará por pantalla dichos 
nombres, pero colocándoles el ordinal correspondiente. Así,por ejemplo, si hay dos Felipes
en los nombres de los reyes, el primero debería aparecer como Felipe 1º y el segundo como 
Felipe 2º.*/

System.out.print("¿Cuántos reyes vas a introducir?: ");
int numRey=Integer.parseInt(System.console().readLine());

String [] nomRey= new String[numRey];

System.out.println();

System.out.println("Introduzca los nombres de los reyes: ");

for(int i=0; i<numRey; i++) {
nomRey[i]=System.console().readLine();
}

System.out.println();
System.out.println("Los reyes son los siguientes: ");
System.out.println();

for(int i=0; i<numRey; i++) {
  int orden=1;
  for( int j=0; j<i; j++) {
    if(nomRey[i].equals(nomRey[j])) {
      orden++;
    }
  }
  
  System.out.println(nomRey[i]+" "+orden+"º");
  
}


}
}



