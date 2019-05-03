package se.lexicon.teresia.lamda_expressions;

@FunctionalInterface
public interface DoStringStuff {
	String operate(String str1, String str2);  
	//int operate(int i1, int i2);  // Functionalinterface may only contain one abstract method
}
