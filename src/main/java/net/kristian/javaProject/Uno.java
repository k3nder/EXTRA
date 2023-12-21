package net.kristian.javaProject;

import java.util.Scanner;


public class Uno 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("intoduce la facha dd/mm (el mes en numeros)");
        String dataS = scan.next();
        int dia = Integer.parseInt(dataS.substring(0,dataS.indexOf("/")));
        int mes = Integer.parseInt(dataS.substring(dataS.indexOf("/") + 1,dataS.length()));
        System.out.println("analizando dia <\"" + dia + "\"> mes <\"" + mes + "\">");
        if(mes == 12 && dia == 25) {
        	System.out.println("Es navidad!!!");
        }
        
    }
}
