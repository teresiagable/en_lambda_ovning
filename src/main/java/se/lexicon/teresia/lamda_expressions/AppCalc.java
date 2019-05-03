package se.lexicon.teresia.lamda_expressions;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

interface Calculator {
	double doCalc(double num1, double num2, char op);
}

interface StringParser {
	String parse(String s);
}

interface NumberSupplier {
	int get();
};

interface Condition {
	boolean test(String s1);
}

public class AppCalc {
	static Calculator calculate = (num1, num2, operator) -> {
		switch (operator) {
		case '+':
			return num1 + num2;
		case '-':
			return num1 - num2;
		case '*':
			return num1 * num2;
		case '/':
			return num1 / num2;
		default:
			return 0;

		}
	};

	public static void main(String args[]) {
		double result = calculate.doCalc(1, 2, '+');
		System.out.println(result);
		System.out.println(parseString("test", (s) -> s.toUpperCase()));

		NumberSupplier intGetter = () -> { // () when no arguments
			Random rnd = new Random();
			return rnd.nextInt();
		};
		System.out.println(intGetter.get());

		List<String> names = Arrays.asList("Erik", "Erika", "Peter", "Petra", "Daniel", "Daniella");
		Condition shorterThanFive = toTest -> toTest.length() < 5;
		conditionalPrint(names, "Names shorter than five letter", shorterThanFive);
		conditionalPrint(names, "names starting with E", s-> s.charAt(0)=='E');
		
	}

	public static String parseString(String toParse, StringParser s) {
		return s.parse(toParse);
	}
	
	public static void conditionalPrint (List<String> sList, String header, Condition condition)
	{
		System.out.println("*********"+header+"*********");
		for (String s : sList) {
			if(condition.test(s)) System.out.println(s);
			
		}
		
	}
}
