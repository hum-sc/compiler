import java.io.*;

//Preprocesador para resolver tipos de las funciones

public class unoPP {
  static String entrada;
  static String salida;
  static String token;
  static String lexema;
  static String Ren;
  static String Col;
  static int Posicion=0;
  static String Tipo;
  static int Maximo=0;
  static String[] funcion = new String[101];



public static File xArchivo(String xName){
    return new File(xName);
}

public static boolean borraArchivo(File xFile){
    return xFile.delete();
}

public static boolean creaEscribeArchivo(File xFile, String mensaje){
	try{
		PrintWriter fileOut = new PrintWriter(
		new FileWriter(xFile, true) );
		fileOut.println(mensaje);
		fileOut.close();
		return true;
	} catch (IOException ex) {
		return false;
	}
}

public static void pausa(){
  BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
  String nada=null;
  try{
    nada = entrada.readLine();

  } catch(Exception e) {
      System.err.println(e);
  }

}

public static void lee_token(File xFile){
  try{
	System.out.print(".");
    FileReader fr = new FileReader(xFile);
    BufferedReader br = new BufferedReader(fr);
    long NoSirve=br.skip(Posicion);
    String linea=br.readLine();
    Posicion=Posicion + linea.length() + 2;
	token = linea;
    linea=br.readLine();
    Posicion=Posicion + linea.length() + 2;
    lexema=linea;
    linea=br.readLine();
    Posicion=Posicion + linea.length() + 2;
    Ren=linea;
    linea=br.readLine();
    Posicion=Posicion + linea.length() + 2;
    Col=linea;
    fr.close();
  } catch(IOException e) { System.out.println("Errorsote"); }

}

public static boolean existe(String fun){
  for(int i=0;i<=Maximo;i++){
    if(funcion[i].equals(fun))
      return true;
  }
  return false;
}

public static void main(String[] argumento){

	System.out.print("\nPREPROCESADOR ");

	entrada=argumento[0]+".lex";

	if(!xArchivo(entrada).exists()){
		System.out.println("\n\n\7ERROR: El archivo a pre-procesar no existe: "+argumento[0]);
		System.exit(4);
	}

	salida=argumento[0]+".cm2";


  for(int i=0;i<=100;i++)
    funcion[i]="";  

  do{
    lee_token(xArchivo(entrada));
    if(token.equals("funcion")){
      lee_token(xArchivo(entrada));
      if(token.equals("numerico")||token.equals("cadena")){
        Tipo=token;
        lee_token(xArchivo(entrada));
        if(token.equals("id")){
          if(existe(lexema)){
             System.out.println("Funcion duplicada: "+lexema);
             System.exit(4);
          } else{
              creaEscribeArchivo(xArchivo(salida),lexema);
              creaEscribeArchivo(xArchivo(salida),Tipo);
              funcion[Maximo++]=lexema;
          }
        }
      }
    }
  }while(!token.equals("finarc"));
  creaEscribeArchivo(xArchivo(salida),"365");
  creaEscribeArchivo(xArchivo(salida),"nosirve");
  System.out.println("");
}

}


