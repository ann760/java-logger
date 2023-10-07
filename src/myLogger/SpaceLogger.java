package myLogger;

public class SpaceLogger implements Logger{

	@Override
	public void log(String string) {
		System.out.println(spaceStr(string));
	}

	@Override
	public void error(String string) {
		// create a new string
		spaceStr(string);
		System.out.println("ERROR: "+ spaceStr(string));
	}
	
//	create method to loop through the string and extract each charcter and add to a new string with a space after.
	public String spaceStr(String string) {
		String newString = "";
//		loop and add each letter with apace to the new string
		for (int i = 0; i < string.length(); i++) {
			if (i == string.length() -1) {
				newString += string.charAt(i);
			} else
				newString += string.charAt(i) + " ";
			}
		return newString;
	}

}
