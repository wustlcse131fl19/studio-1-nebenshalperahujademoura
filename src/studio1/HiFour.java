package studio1;

import support.cse131.ArgsProcessor;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		String s0 = ap.nextString("What is the name of the first member of your group?");
		String s1 = ap.nextString("What is the name of the second member of your group?");
		String s2 = ap.nextString("What is the name of the third member of your group?");
		String s3 = ap.nextString("What is the name of the fourth member of your group?");
		//
		// Say hello to the names in s0 through s3.
		//
		System.out.println("Hello, " + s0 + ", " + s1 + ", " + s2 + ", " + s3 + ". How are you today?" );
	}
}
