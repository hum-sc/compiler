import java.io.*;

public class unoLG {
    static String entrada;
    static String salida;
    // Hash map de etiquetas
    static java.util.HashMap<String, String> etiquetas = new java.util.HashMap<String, String>();
    public  static void main (String[] argumento){
        entrada = argumento[0] + ".cm3";
        salida = argumento[0] + ".java";
        if (!xArchivo(entrada).exists()){
            System.out.println("\n\n\7ERROR: El archivo a pre-procesar no existe: " + argumento[0]);
            System.exit(4);
        }
        try{
            FileReader fr = new FileReader(xArchivo(entrada));
            BufferedReader br = new BufferedReader(fr);
            int i = 0;
            StringBuilder sinEtiquetas = new StringBuilder();
            for (String linea = br.readLine(); linea != null; linea = br.readLine()){
                if(!linea.isEmpty()){
                    // Si la linea inicia con numero, le sigue un espacio y cualquier letra
                    if(linea.matches("^\\d+\\s\\w.*")){
                        //Obtiene los numeros
                        String num = linea.substring(0, linea.indexOf(" "));
                        //Obtiene la etiqueta
                        // Obtiene el resto de la linea
                        linea = linea.substring(linea.indexOf(" ")+1);
                        // Colocarlo en el hash map
                        etiquetas.put(num, i+"");
                        // Si hay " cambiarlos por \"
                    }
                    linea = linea.replace("\"", "");
                    //linea = linea.trim();
                    sinEtiquetas.append(linea).append("\n");
                    i++;
                }
            }
            fr.close();
            // Escribir el programa sin etiquetas en un archivo temporal
            if (creaEscribeArchivo(xArchivo(entrada+".cm4"), sinEtiquetas.toString())){
                System.out.println("Pre-procesamiento exitoso");
            } else {
                System.out.println("Error al pre-procesar el codigo");
            }
            String programa = "import java.io.*;\n" +
                    "\n" +
                    "public class "+argumento[0]+" {\n" +
                    "\n" +
                    "\tstatic String inst[]=new String["+i+"];\n" +
                    "\tstatic String trace=\"\";\n" +
                    "\tstatic String line=\"0\";\n" +
                    "\n" +
                    "\tpublic static void main(String[] args){\n" +
                    "\t\tif(args.length>0) " +
                    "trace=args[0];\n" +
                    "\t\tif(args.length==2) " +
                    "line=args[1];\n";
            fr = new FileReader(xArchivo(entrada+".cm4"));
            br = new BufferedReader(fr);
            i = 0;

            for (String linea = br.readLine(); linea != null; linea = br.readLine()){
                if(!linea.isEmpty()){
                    // Si la linea tiene un mete$ digito, cambiar por mete etiqueta
                    if(linea.matches("mete\\$\s\\d+")){
                        //Obtiene los numeros
                        String num = linea.substring(linea.indexOf(" ")+1);
                        linea = "mete "+etiquetas.get(num);
                    }
                    programa += "\t\tinst["+i+"]=\"" + linea + "\";\n";
                    i++;
                }
            }
            fr.close();
            programa += "\t\tMaqCAPJava.programa(inst,args);\n" +
                    "\t}\n" +
                    "\n" +
                    "}";

            // Escribir el programa en el archivo de salida
            if (creaEscribeArchivo(xArchivo(salida), programa)){
                System.out.println("Ligado exitoso");
            } else {
                System.out.println("Error al ligar el codigo");
            }

        } catch (Exception e){
            System.out.println("Error al ligar el codigo");
        }

    }
    public static File xArchivo(String xName){
        return new File(xName);
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

}
