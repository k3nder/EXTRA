package net.kender.project;

import java.io.File;
import java.io.IOException;

import net.k3nder.Runner.Runner;
import net.kender.logger.log5k.conf.log5kConf;
import net.k3nder.Runner.Main;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main(String[] args) throws SecurityException, IOException {
		net.kender.logger.log5k.Logger.config = new log5kConf(App.class.getResourceAsStream("conf.properties"));
		Runner run = new Runner(App.class.getResource("/net/kender/project/conf.json"));
		while(true) {
			run.initInput();
		}
	}
}

