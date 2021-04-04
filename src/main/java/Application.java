
import java.util.Scanner;
import java.util.logging.Logger;

public class Application {

	private final static Logger logger = Logger.getLogger(Application.class.getName());

	public static void main(String args[]) {
		logger.info("Application execution started");
		execute();
	}

	public static void execute() {
		System.out.print("Sample maven application");
	}
}
