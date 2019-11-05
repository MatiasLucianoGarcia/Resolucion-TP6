package aspectos;

import java.io.PrintStream;

public class Logger {
	private PrintStream stream;
	
	public Logger() {
		stream=System.out;
	}
	
	public void log(String message) {
		stream.println(message);
	}
}
