package se.lexicon.teresia.lamda_expressions;

/**
 * Hello world!
 *
 */
public class App {

	static DoStringStuff getBiggest=new DoStringStuff(){

	@Override public String operate(String str1,String str2)
	{
		if(str1.length()>str2.length())
			return str1;
		else return str2;
		}
	};

	static DoStringStuff concat = (String s1, String s2) ->  s1 + " " + s2; // implied return

	public static void main(String[] args) {
//		DoStringStuff concat = new StringCombiner();
//		System.out.println(concat.operate("Hello", "World"));

////		System.out.println(getBiggest.operate("ABC", "ABCD"));
//
//		System.out.println(doStuff("Teresia", "G", getBiggest));
//		String result = doStuff("ABC", "DEF", new DoStringStuff() {
//
//			@Override
//			public String operate(String str1, String str2) {
//				return str1 + str2;
//			}
//		});
//		System.out.println(result);
		System.out.println(doStuff("Teresia", "Gable",concat));// calling the method;
		System.out.println(concat.operate("Lamda", "Expression")); //using the lamda expression directly
		String result = doStuff("A String", "Another String",(s1,s2) -> s1 + " " + s2);
		System.out.println(result);
	}

	public static String doStuff(String s1, String s2, DoStringStuff operation) {
		return operation.operate(s1, s2);
	}
}
