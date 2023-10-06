package myLogger;

public class App {

	public static void main(String[] args) {
		
		Logger loggerAst = new AsteriskLogger();
		// use the log
		loggerAst.log("Hello");
		
		System.out.println();
		
		// use the error
		loggerAst.error("Hello");
		
		System.out.println();
		
		Logger loggerSpace = new SpaceLogger();
		// use the log
		loggerSpace.log("Hello");
		
		System.out.println();
		
		// use the error
		loggerSpace.error("Hello");
		
		
	}

}
