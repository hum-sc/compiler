// import file
import java.io.*;

public class unoAL {
    private static int fileSize;
    public static  int a_a = 0;
    public static  int a_i = 0;
    public static boolean fin_archivo = false;
    public static char[] linea ;
    public static char c;
    public static int renglon = 0;
    public static int columna = 0;
    public static int comienzo = 0;
    public static int estado = 0;
    public static String tokenVal = "";
    public static String[] pr;
    public static int contCol = 0;
    public static int contRen = 0;
    public static int renglonAnt = 0;
    public static int renglonUltimo = 0;
    public static int columnaUltima = 0;
    public static int ren = 0;

    // From args get the file name and read it
    public static void main(String[] args) {
        pr = new String[28];
        pr[0]="declara";
        pr[1]="fin_declara";
        pr[2]="dato";
        pr[3]="numerico";
        pr[4]="cadena";
        pr[5]="comienza";
        pr[6]="termina";
        pr[7]="funciones";
        pr[8]="fin_funciones";
        pr[9]="funcion";
        pr[10]="fin_funcion";
        pr[11]="mientras";
        pr[12]="fin_mientras";
        pr[13]="si";
        pr[14]="entonces";
        pr[15]="otro_caso";
        pr[16]="fin_si";
        pr[17]="repite";
        pr[18]="hasta";
        pr[19]="lee";
        pr[20]="escribe";
        pr[21]="escribe_ret";
        pr[22]="o";
        pr[23]="y";
        pr[24]="no";
        pr[25]="div";
        pr[26]="mod";
        pr[27]="abs";
        a_a = 0;
        a_i = 0;
        renglon = 1;
        columna = 1;
        String t;
        String inputFileName = args[0]+".fte";
        String outputFileName = args[0]+".lex";



        linea = abreLeeCierra(inputFileName);
        // Imprime linea
        if (linea == null) {
            System.out.println("Error: No se pudo abrir el archivo");
            error();
            System.exit(1);
        }
        File outputFile = xArchivo(outputFileName);
        do{
            estado = 0;
            comienzo = 0;
            renglonAnt = renglon;
            columna = contCol;

            t = token();
            if(!t.equals("omite")){
                if(palabraReservada(tokenVal)){
                    t = tokenVal.toLowerCase();
                }
                creaEscribeArchivo(outputFile,t);
                creaEscribeArchivo(outputFile,tokenVal);
                // Escribe el renglon y la columna
                creaEscribeArchivo(outputFile, String.valueOf(renglon));
                creaEscribeArchivo(outputFile, String.valueOf(contCol));
            }
            a_i = a_a;
        } while (!fin_archivo);
        creaEscribeArchivo(outputFile,"finarc");
        creaEscribeArchivo(outputFile,"finarc");
        creaEscribeArchivo(outputFile,"666");
        creaEscribeArchivo(outputFile,"666");

    }

    public static char[] abreLeeCierra(String xName){
        File xFile = new File(xName);
        char[] data;
        try {
            FileReader fin = new FileReader(xFile);
            fileSize = (int) xFile.length();
            data = new char[fileSize+1];
            fin.read(data, 0, fileSize);
            data[fileSize] = ' ';
            fileSize++;
            return (data);
        } catch (IOException e) {

        }
        return null;
    }

    public static void pausa(){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String nada = null;
        try{
            nada = entrada.readLine();
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static char lee_car(){
        if (a_a  <= fileSize-1){
            if (linea[a_a] == 10){
                contCol = 1;
                renglon++;

            }else {
                contCol++;
            }
            return linea[a_a++];
            //System.out.println("Caracter: " +c+" ren: "+renglon+" col: "+columna);
        }else{
            fin_archivo = true;
            return 255;
        }
    }

    public static  boolean creaEscribeArchivo(File xFile, String mensaje){
        try {
            PrintWriter fileOut = new PrintWriter(new FileWriter(xFile, true));
            fileOut.println(mensaje);
            fileOut.close();
            return true;
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public static File xArchivo(String xName){
        return new File(xName);
    }
    // - delim significa cualquier carácter \r, \n, \t o espacio

    public static boolean delim(int x){
        //System.out.println("delim: "+x);
        return x == 9 || x == 10 || x == 13 || x == 32;
    }
    public static boolean letra(int x){
        return x >= 65 && x <= 90 || x >= 97 && x <= 122;
    }
    public static boolean digito(int x){
        return x >= 48 && x <= 57;
    }
    // any1 significa aceptar cualquier carácter excepto \r, \n, \t, ", eof
    public static boolean any1(int x){
        return x != 9 && x != 10 && x != 13 && x != 34 && x != 255;
    }
    //  - any2 significa aceptar cualquier carácter excepto \r, \n, eof
    public static boolean any2(int x){
        return x != 10 && x != 13 && x != 255;
    }
    // - any3 significa aceptar cualquier carácter excepto eof
    public static boolean any3(int x){
        return x != 255;
    }
    public static String ob_lex(int a_a, int a_i){
        StringBuilder x= new StringBuilder();
        for(int i=a_i;i<a_a;i++)
            x.append(linea[i]);
        return(x.toString());
    }
    public static void error(){
        System.out.println("ERROR: en el caracter["+c+"] cerca del renglon "+renglon+" columna "+columna);
        System.exit(4);
    }

    public static boolean palabraReservada(String x){
        x = x.toLowerCase();
        for (String element : pr) {
            if (x.equals(element)) return true;
        }
        return false;
    }

    public static int diagrama(){
        // decrementa columna
        a_a = a_i;
        renglonUltimo = ren;
        columnaUltima = contCol;
        ren = renglonAnt;
        contCol = columna;
        switch (comienzo){
            case 0:
                comienzo = 4;
                break;
            case 4:
                comienzo = 8;
                break;
            case 8:
                comienzo = 13;
                break;
            case 13:
                comienzo = 16;
                break;
            case 16:
                comienzo = 27;
                break;
            case 27:
                comienzo = 30;
                break;
            case 30:
                error();
                break;
        }
        return comienzo;
    }

    public static String token(){
        while (true){

            switch (estado){
                case 0:
                    //System.out.println("estado 0");
                    c = lee_car();
                    if (letra(c)) estado = 1;
                    else estado = diagrama();
                    break;
                case 1:
                    c = lee_car();
                    if (letra(c) || digito(c)) estado = 1;
                    else if (c == '_') estado = 2;
                    else estado = 3;
                    break;
                case 2:
                    c = lee_car();
                    if (letra(c) || digito(c)) estado = 1;
                    else estado = diagrama();
                    break;
                case 3:
                    a_a--;
                    contCol--;
                    tokenVal = ob_lex(a_a, a_i);
                    a_i = a_a;
                    return ("id");
                case 4:
                    //System.out.println("estado 4");
                    c = lee_car();
                    if (c == '"') estado = 5;
                    else estado = diagrama();
                    break;
                case 5:
                    c = lee_car();
                    if (any1(c)) estado = 6;
                    else estado = diagrama();
                    break;
                case 6:
                    c = lee_car();
                    if (c == '"') estado = 7;
                    else if (any1(c)) estado = 6;
                    else estado = diagrama();
                    break;
                case 7:
                    tokenVal = ob_lex(a_a, a_i);
                    a_i = a_a;
                    return ("cad");
                case 8:
                    //System.out.println("estado 8");
                    c = lee_car();
                    if (digito(c)) estado = 9;
                    else estado = diagrama();
                    break;
                case 9:
                    c = lee_car();
                    if (digito(c)) estado = 9;
                    else if (c == '.') estado = 10;
                    else estado = diagrama();
                    break;
                case 10:
                    c = lee_car();
                    if (digito(c)) estado = 11;
                    else estado = diagrama();
                    break;
                case 11:
                    c = lee_car();
                    if (digito(c)) estado = 11;
                    else estado = 12;
                    break;
                case 12:
                    a_a--;
                    contCol--;
                    tokenVal = ob_lex(a_a, a_i);
                    a_i = a_a;
                    return ("num");
                case 13:
                    //System.out.println("estado 13");
                    c = lee_car();
                    if (digito(c)) estado = 14;
                    else estado = diagrama();
                    break;
                case 14:
                    c = lee_car();
                    if (digito(c)) estado = 14;
                    else estado = 15;
                    break;
                case 15:
                    a_a--;
                    contCol--;
                    tokenVal = ob_lex(a_a, a_i);
                    a_i = a_a;
                    return ("num");
                case 16:
                    //System.out.println("estado 16");
                    c = lee_car();
                    if (c == '>') estado = 17;
                    else if (c == '<') estado = 20;
                    else if (c == '=') estado = 25;
                    else estado = diagrama();
                    break;
                case 17:
                    c = lee_car();
                    if (c == '=') estado = 18;
                    else estado = 19;
                    break;
                case 18:
                    tokenVal = ob_lex(a_a, a_i);
                    a_i = a_a;
                    return ("mai");
                case 19:
                    a_a--;
                    tokenVal = ob_lex(a_a, a_i);
                    a_i = a_a;
                    return (">");
                case 20:
                    c = lee_car();
                    if (c == '=') estado = 21;
                    else if (c=='-') estado = 22;
                    else if (c=='>') estado = 23;
                    else estado = 24;
                    break;
                case 21:
                    tokenVal = ob_lex(a_a, a_i);
                    a_i = a_a;
                    return ("mei");
                case 22:
                    tokenVal = ob_lex(a_a, a_i);
                    a_i = a_a;
                    return ("asig");
                case 23:
                    tokenVal = ob_lex(a_a, a_i);
                    a_i = a_a;
                    return ("dif");
                case 24:
                    a_a--;
                    tokenVal = ob_lex(a_a, a_i);
                    a_i = a_a;
                    return ("<");
                case 25:
                    c = lee_car();
                    if (c == '<') estado = 21;
                    else if (c == '>') estado = 18;
                    else estado = 26;
                    break;
                case 26:
                    a_a--;
                    tokenVal = ob_lex(a_a, a_i);
                    a_i = a_a;
                    return ("=");
                case 27:
                    //System.out.println("estado 27");
                    c = lee_car();
                    if (delim(c)) estado = 28;
                    else estado = diagrama();
                    break;
                case 28:
                    c = lee_car();
                    if (delim(c)) estado = 28;
                    else estado = 29;
                    break;
                case 29:
                    a_a--;
                    contCol--;
                    tokenVal = ob_lex(a_a, a_i);
                    a_i = a_a;
                    return ("omite");
                case 30:
                    c = lee_car();
                    if (c == '+') estado = 31;
                    else if (c == '-') estado = 32;
                    else if (c == '*') estado = 35;
                    else if (c == '/') estado = 36;
                    else if (c == ';') estado = 43;
                    else if (c == '(') estado = 44;
                    else if (c == ')') estado = 45;
                    else if (c == ',') estado = 46;
                    else if (c == '[') estado = 47;
                    else if (c == ']') estado = 48;
                    else if (c == 255) estado = 49;
                    else error();
                    break;
                case 31:
                    tokenVal = ob_lex(a_a, a_i);
                    a_i = a_a;
                    return ("+");
                case 32:
                    c = lee_car();
                    if (c == '>') estado = 33;
                    else estado = 34;
                    break;
                case 33:
                    tokenVal = ob_lex(a_a, a_i);
                    a_i = a_a;
                    return ("opdec");
                case 34:
                    a_a--;
                    contCol--;
                    tokenVal = ob_lex(a_a, a_i);
                    a_i = a_a;
                    return ("-");
                case 35:
                    tokenVal = ob_lex(a_a, a_i);
                    a_i = a_a;
                    return ("*");
                case 36:
                    c = lee_car();
                    if (c == '/') estado = 37;
                    else if (c == '*') estado = 39;
                    else estado = 42;
                    break;
                case 37:
                    c = lee_car();
                    if (any2(c)) {
                        estado = 37;
                    }
                    else estado = 38;
                    break;
                case 38:
                    a_a--;
                    contCol--;
                    tokenVal = ob_lex(a_a, a_i);
                    a_i = a_a;
                    return ("omite");
                case 39:
                    c = lee_car();
                    if (c == '*') estado = 40;
                    else if (any3(c)) estado = 39;
                    else estado = diagrama();
                    break;
                case 40:
                    c = lee_car();
                    if (c == '/') estado = 41;
                    else if (c == '*') estado = 40;
                    else if (any3(c)) estado = 39;
                    else estado = diagrama();
                    break;
                case 41:
                    tokenVal = ob_lex(a_a, a_i);
                    a_i = a_a;
                    return ("omite");
                case 42:
                    a_a--;
                    contCol--;
                    tokenVal = ob_lex(a_a, a_i);
                    a_i = a_a;
                    return ("/");
                case 43:
                    tokenVal = ob_lex(a_a, a_i);
                    a_i = a_a;
                    return (";");
                case 44:
                    tokenVal = ob_lex(a_a, a_i);
                    a_i = a_a;
                    return ("(");
                case 45:
                    tokenVal = ob_lex(a_a, a_i);
                    a_i = a_a;
                    return (")");
                case 46:
                    tokenVal = ob_lex(a_a, a_i);
                    a_i = a_a;
                    return (",");

                case 47:
                    tokenVal = ob_lex(a_a, a_i);
                    a_i = a_a;
                    return ("[");
                case 48:
                    tokenVal = ob_lex(a_a, a_i);
                    a_i = a_a;
                    return ("]");
                case 49:
                tokenVal = ob_lex(a_a, a_i);
                a_i = a_a;
                return ("omite");
            }

        }
    }

}