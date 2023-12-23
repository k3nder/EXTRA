package net.kender.project;

import java.io.File;
import java.io.IOException;

import net.k3nder.Runner.Runner;
import net.k3nder.Runner.Main;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main(String[] args) throws SecurityException, IOException {
		Runner run = new Runner(App.class.getResource("/net/kender/project/conf.json"));
		run.loadForMainClass();
		Main.main(args); 
	}
}

