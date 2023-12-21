package net.kender.project;

import java.util.HashMap;
import java.util.Scanner;

import net.kender.project.Cinco.Cinco;
import net.kender.project.Quatro.Quatro;
import net.kender.project.Seis.Seis;
import net.kender.project.Siete.Siete;
import net.kender.project.Tres.Tres;
import net.kender.project.Uno.Uno;
import net.kender.project.Dos.Dos;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        HashMap<Integer,Runnable> has = new HashMap<Integer,Runnable>();
        has.put(1, () -> {Uno.main(args);});
        has.put(2, () -> {Dos.main(args);});
        has.put(3, () -> {Tres.main(args);});
        has.put(4, () -> {Quatro.main(args);});
        has.put(5, () -> {Cinco.main(args);});
        has.put(6, () -> {Seis.main(args);});
        has.put(7, () -> {Siete.main(args);});
        while(true) {
        	Scanner scan = new Scanner(System.in);
        	System.out.println("selectiona un proyecto del 1 - 7 para lanzar i ejecutar");
        	int select = scan.nextInt();
        	has.get(select).run();
        }
    }
}
