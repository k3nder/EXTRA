package net.kender.project.Dos;
import net.kristian.objects.NumScanner;
public class Dos {
	public static void main(String[] args) {
		System.out.println("\r\n"
				+ "\r\n"
				+ " _______     _______     \r\n"
				+ "|\\  ___ \\   /  ___  \\    \r\n"
				+ "\\ \\   __/| /__/|_/  /|   \r\n"
				+ " \\ \\  \\_|/_|__|//  / /   \r\n"
				+ "  \\ \\  \\_|\\ \\  /  /_/__  \r\n"
				+ "   \\ \\_______\\|\\________\\\r\n"
				+ "    \\|_______| \\|_______|\r\n"
				+ "                         \r\n"
				+ "                         \r\n"
				+ "                         \r\n"
				+ "\r\n"
				+ "");
		int[] nums = new NumScanner(System.in).get(10);
		System.out.println("suma :" +( nums[6] + nums[7] + nums[8] + nums[9] + nums[5] ));
	}
}
