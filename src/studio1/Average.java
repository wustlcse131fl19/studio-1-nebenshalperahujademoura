package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        double x = ap.nextDouble("what is the first of two integers to be averaged?");
        double y = ap.nextDouble("what is the second of two integers to be averaged?");

        System.out.println("the average of both integers is: " + ((x + y) / 2));

    }
}
