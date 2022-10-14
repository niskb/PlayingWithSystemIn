package p1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Demo implements Runnable {

	public static void main(String[] args) {
		printSystemInformation();
		printSystemPerformance();
	}
	
	private static void printSystemInformation() {
		System.out.println("System Information:");
		System.out.println("");
		System.out.println("OS Architecture: " + System.getProperty("os.arch"));
		System.out.println("OS Name: " + System.getProperty("os.name"));
		System.out.println("File Seperator: " + System.getProperty("file.separator"));
		System.out.println("User Account Name: " + System.getProperty("user.name"));
	}
	
	@SuppressWarnings("static-access")
	private static void printSystemPerformance() {
		Thread th = new Thread(new Demo());
		th.start();
		th.currentThread().interrupt();
		return;
	}

	@Override
	public void run() {
		runSystemInfo();
	}
	
	private static void runSystemInfo() {
		try {
			Process process = Runtime.getRuntime().exec("systeminfo");
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			
			String line = "";
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
