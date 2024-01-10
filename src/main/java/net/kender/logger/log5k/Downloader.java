package net.kender.logger.log5k;

import java.io.PrintStream;

public class Downloader {
	private String color;
	public Downloader(String color) {
		this.color = color;
	}
	public void init() {
		System.out.println("<---------------> %0");
	}
	public void setPercentage(int per) {
		
	}
}
