package net.kender.project.Uno;

import java.util.Scanner;

import net.k3nder.Runner.Runner;
import net.kender.logger.log5k.Logger;
import net.kender.logger.log5k.conf.CustomLogger;
import net.kender.logger.log5k.conf.log5kConf;

public class Uno {
	private static final Logger log = new Logger(Uno.class);
	public static void main(String[] args) {
		log5kConf config = new log5kConf(Uno.class.getResourceAsStream("/net/kender/project/conf.properties"));
		log.setConfig(config);
		CustomLogger input = new CustomLogger("\u001B[33;1m","INPUT",true,false,true,false,false);
		Scanner scan = Runner.scan;
		int acum = 0;
		do {
			log.log("introduce un numero", input);
			int num = scan.nextInt();
			if(num == 9999) {
				break;
			}
			acum = acum + num;
		} while(acum < 9999);
		log.debug("Acumulado: " + acum);
		log.debug("este numero es: " + (acum == 0 ? "cero" : (acum < 0 ? "es menor que 0" : "es mayor que 0")));
	}

}
