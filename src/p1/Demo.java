package p1;

public class Demo implements Runnable{

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
	
	private static void printSystemPerformance() {
		
	}

	@Override
	public void run() {
		
	}
	
}
