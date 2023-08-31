


public class StringLength {
	
	public static void main(String[] args) {
		
		String text = " java is a fun language    ";
		
		String text1 = "java12is12a12fun12language    ";

		 
		System.out.println("lenth "+text.length());
		System.out.println(" CONTAINS " + text.contains("fun"));
		
		
		System.out.println(text.trim());
		
		
		
		// replce method 
		System.out.println(text.replace("a", "b"));
		
		
	// replace all
		String regex = "\\d";
		System.out.println(text1.replaceAll("12", " "));

		System.out.println(text1.replaceAll(regex, " "));
		
		System.out.println(text1.startsWith("java"));
		System.out.println(text1.endsWith(" "));


	}
	
	

}
