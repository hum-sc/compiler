import java.io.*;

public class Piramide {

	static String inst[]=new String[73];
	static String trace="";
	static String line="0";

	public static void main(String[] args){
		if(args.length>0) trace=args[0];
		if(args.length==2) line=args[1];
		inst[0]="mete Introduce el numero de filas para la piramide: ";
		inst[1]="escribe";
		inst[2]="mete 0";
		inst[3]="lee";
		inst[4]="asig";
		inst[5]="mete 1";
		inst[6]="mete 1";
		inst[7]="asig";
		inst[8]="mete 3";
		inst[9]="mete 0";
		inst[10]="mem";
		inst[11]="mete 1";
		inst[12]="mem";
		inst[13]="opdif";
		inst[14]="asig";
		inst[15]="mete  ";
		inst[16]="escribe";
		inst[17]="mete 3";
		inst[18]="mete 3";
		inst[19]="mem";
		inst[20]="mete 1";
		inst[21]="opdif";
		inst[22]="asig";
		inst[23]="mete 0";
		inst[24]="mete 3";
		inst[25]="mem";
		inst[26]="opdif";
		inst[27]="copia";
		inst[28]="opabs";
		inst[29]="opsum";
		inst[30]="mete 15";
		inst[31]="irfalso";
		inst[32]="mete 2";
		inst[33]="mete 1";
		inst[34]="asig";
		inst[35]="mete * ";
		inst[36]="escribe";
		inst[37]="mete 2";
		inst[38]="mete 2";
		inst[39]="mem";
		inst[40]="mete 1";
		inst[41]="opsum";
		inst[42]="asig";
		inst[43]="mete 2";
		inst[44]="mem";
		inst[45]="mete 1";
		inst[46]="mem";
		inst[47]="opdif";
		inst[48]="copia";
		inst[49]="opabs";
		inst[50]="opsum";
		inst[51]="mete 35";
		inst[52]="irfalso";
		inst[53]="mete  ";
		inst[54]="escribenl";
		inst[55]="mete 1";
		inst[56]="mete 1";
		inst[57]="mem";
		inst[58]="mete 1";
		inst[59]="opsum";
		inst[60]="asig";
		inst[61]="mete 1";
		inst[62]="mem";
		inst[63]="mete 0";
		inst[64]="mem";
		inst[65]="opdif";
		inst[66]="copia";
		inst[67]="opabs";
		inst[68]="opsum";
		inst[69]="mete 8";
		inst[70]="irfalso";
		inst[71]="fin";
		inst[72]="fin";
		MaqCAPJava.programa(inst,args);
	}

}
